package clone.timesheet;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimeSheetItem {

    private String employee, project;
    private LocalDateTime from, to;

    public static TimeSheetItem withDifferentDay(TimeSheetItem timeSheetItem, LocalDate localDate) {
        TimeSheetItem newTimeSheetItem = new TimeSheetItem(timeSheetItem);
        newTimeSheetItem.from = LocalDateTime.of(localDate, newTimeSheetItem.from.toLocalTime());
        newTimeSheetItem.to = LocalDateTime.of(localDate, newTimeSheetItem.to.toLocalTime());
        return newTimeSheetItem;
    }

    public TimeSheetItem(String employee, String project, LocalDateTime from, LocalDateTime to) {
        this.employee = employee;
        this.project = project;
        this.from = from;
        this.to = to;
    }



    public String getEmployee() {
        return employee;
    }



    public String getProject() {
        return project;
    }



    public LocalDateTime getFrom() {
        return from;
    }



    public LocalDateTime getTo() {
        return to;
    }



    public TimeSheetItem(TimeSheetItem tsi) {
        employee = tsi.employee;
        project = tsi.project;
        from = tsi.from;
        to = tsi.to;
    }



}
