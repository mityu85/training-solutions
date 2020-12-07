package defaultconstructor.date;

public class SimpleDate {

    private int year;
    private int month;
    private int day;

    private boolean isCorrect(int year, int month, int day) {
        return year >= 1900 &&
                month > 0 &&
                month < 13 &&
                day > 0 &&
                day <= calculateMonthLength(year, month);
    }

    private boolean isLeapYear(int year) {
        return (year % 100 == 0 && year % 400 == 0) || year % 4 == 0;
    }

    private int calculateMonthLength(int year, int month) {
        int daysNumber = 0;
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysNumber = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysNumber = 30;
            case 2:
                if (isLeapYear(year)) {
                    daysNumber = 29;
                } else {
                    daysNumber = 28;
                }
                break;
            default:
                throw new IllegalArgumentException("Wrong month!");
        }
        return daysNumber;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(int year, int month, int day) {
        if (isCorrect(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("Wrong parameters!");
        }
    }
}
