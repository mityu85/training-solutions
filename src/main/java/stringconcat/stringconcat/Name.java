package stringconcat.stringconcat;

public class Name {

    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    private boolean isEmpty(String str) {
        if (str == "") {
            return true;
        } else {
            return false;
        }
    }

    public Name(String familyName, String middleName, String givenName, Title title) {
        if (isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("isEmpty!");
        }
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public Name(String familyName, String middleName, String givenName) {
        if (isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("isEmpty!");
        }
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
    }

    public String concatNameWesternStyle() {

        String concat = ((title.name().concat(givenName)).concat(middleName)).concat(familyName);
        return concat;
    }

    public String concatNameHungarianStyle() {
        if (middleName.isEmpty()) {
            return familyName + " " + givenName;
        } else {
            return familyName + " " + middleName + " " + givenName;
        }

    }

}
