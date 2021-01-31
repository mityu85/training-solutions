package timesheet;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Company {

    private InputStream employeesFile;
    private InputStream projectFile;
    private List<ReportLine> reportLineArrayList;
    private List<TimeSheetItem> timeSheetItems = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    private List<Project> projects = new ArrayList<>();

    public Company(InputStream employeesFile, InputStream projectFile) {
        this.employeesFile = employeesFile;
        loadEmployeesFile(employeesFile);
        this.projectFile = projectFile;
        loadProjectFile(projectFile);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void addTimeSheetItem(Employee employee, Project project, LocalDateTime beginDate, LocalDateTime endDate) {
        for (Employee emp: employees) {

        }
        timeSheetItems.add(new TimeSheetItem(employee, project, beginDate, endDate));
    }

    public List<ReportLine> calculateProjectByNameYearMonth(String employeeName, int year, int month) {
        List<ReportLine> reportLines = new ArrayList<>();
        isWrongName(employeeName, employees);
        reportLines = fillUpReportLine(projects);
        for (TimeSheetItem tsi: timeSheetItems) {
            if (isProjectInTimeSheet(tsi, reportLines, employeeName, year, month)) {
                if (isProjectExist(tsi, reportLines)) {

                }
            }
        }
        return reportLineArrayList = reportLines;
    }

    private List<ReportLine> fillUpReportLine(List<Project> projects) {
        List<ReportLine> reportLines = new ArrayList<>();
        for (Project p: projects) {
            reportLines.add(new ReportLine(p, 0));
        }
        return reportLines;
    }

    public void printToFile(String employeeName, int year, int month, Path file) {
        boolean isTitleFilled = false;
        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(file))) {
            List<ReportLine> reportLines = new ArrayList<>(calculateProjectByNameYearMonth(employeeName, year, month));
            for (ReportLine rl: reportLines) {
                if (rl.getTime() == 0) {
                    continue;
                }
                for (TimeSheetItem tsi: timeSheetItems) {
                    if (isProjectInTimeSheet(tsi, reportLineArrayList, employeeName, year, month) && !isTitleFilled) {
                        pw.printf(
                                "%s\t%d-%02d\t%d\n", employeeName,
                                                            tsi.getBeginDate().getYear(),
                                                            tsi.getBeginDate().getMonthValue(),
                                                            sumTimes(tsi, reportLines, employeeName, year, month));
                        pw.printf("%s\t%d\n", rl.getProject().getName(), rl.getTime());
                        isTitleFilled = true;
                    } else {
                        pw.printf("%s\t%d\n", rl.getProject().getName(), rl.getTime());
                    }
                    break;
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("File can not write", e);
        }
    }

    private long sumTimes(TimeSheetItem tsi, List<ReportLine> reportLines, String employeeName, int year, int month) {
       long sum = 0;
       if (isProjectInTimeSheet(tsi, reportLineArrayList,employeeName, year, month)) {
           for (ReportLine rl: reportLines) {
               sum += rl.getTime();
           }
        }
        return sum;
    }

    private boolean isProjectInTimeSheet(TimeSheetItem tsi, List<ReportLine> reportLines, String employeeName, int year, int month) {
        boolean valid = false;
        for (ReportLine rl: reportLines) {
            if (tsi.getEmployee().getName().equals(employeeName) &&
                    tsi.getBeginDate().getYear() == year &&
                    tsi.getBeginDate().getMonthValue() == month &&
                    tsi.getProject().getName().equals(rl.getProject().getName())) {
                valid = true;
            }
        }
        return valid;
    }

    private boolean isWrongName(String str, List<Employee> employees) {
        for (Employee emp: employees) {
            if (emp.getName().equals(str)) {
                return true;
            }
        }
        throw new IllegalArgumentException();
    }

    private void loadEmployeesFile(InputStream employeesFile) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(employeesFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] temp = line.split(" ");
                employees.add(new Employee(temp[0], temp[1]));
            }
        } catch (IOException e) {
            throw new IllegalStateException("employeesFile can not read", e);
        }
    }

    private void loadProjectFile(InputStream projectFile) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(projectFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                projects.add(new Project(line));
            }
        } catch (IOException e) {
            throw new IllegalStateException("projectFile can not read", e);
        }
    }

    private boolean isProjectExist(TimeSheetItem timeSheetItem, List<ReportLine> reportLines) {
        boolean valid = false;
        for (ReportLine rl: reportLines) {
            if (rl.getProject().getName().equals(timeSheetItem.getProject().getName())) {
                rl.addTime(timeSheetItem.hoursBetweenDates());
                valid = true;
            }
        }
        return valid;
    }
}
