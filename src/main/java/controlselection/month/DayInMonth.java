package controlselection.month;

public class DayInMonth {

    public int days(int year, String month) {
        int num;
        switch (month.toLowerCase()) {
            case "január":
            case "március":
            case "május":
            case "július":
            case "augusztus":
            case "október":
            case "december":
                num = 31;
                break;
            case  "április":
            case  "június":
            case  "szeptember":
            case  "november":
                num = 30;
                break;
            case "február":
                if (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0)) {
                    num = 29;
                } else {
                    num = 28;
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid month: " + month);
        }
        return num;
    }

    public static void main(String[] args) {

        DayInMonth dayInMonth = new DayInMonth();
        System.out.println(dayInMonth.days(1985, "OKTÓBER"));
        System.out.println(dayInMonth.days(1985, "február"));
        System.out.println(dayInMonth.days(2020, "február"));
    }
}
