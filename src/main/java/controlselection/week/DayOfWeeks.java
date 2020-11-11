package controlselection.week;

public class DayOfWeeks {

    public String days(String day) {
        String result;
        switch (day.toLowerCase()) {
            case "hétfő":
                result = "hét eleje";
                break;
            case "kedd":
            case "szerda":
            case "csütörtök":
                result = "hét közepe";
                break;
            case "péntek":
                result = "majdnem hétvége";
                break;
            case "szombat":
            case "vasárnap":
                result = "hét vége";
                break;
            default:
                throw new IllegalArgumentException("Invalid day: " + day);
        }
        return result;
    }

    public static void main(String[] args) {

        DayOfWeeks dayOfWeeks = new DayOfWeeks();
        System.out.println(dayOfWeeks.days("KEDD"));
        System.out.println(dayOfWeeks.days("héTFő"));
        System.out.println(dayOfWeeks.days("péntek"));
        System.out.println(dayOfWeeks.days("VASárnap"));
    //  System.out.println(dayOfWeeks.days("abdc"));
    }
}
