package stringbuilder;

public class NameBuilder {

    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;
    private StringBuilder sb = new StringBuilder();

    private boolean isEmpty(String str) {
        if (str == null || str.isBlank()) {
            return true;
        } else {
            return false;
        }
    }

    public String concatNameWesternStyle(String familyName, String middleName, String givenName, Title title) {

        if (isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("isEmpty!");
        }
        if (title == null) {
            if (isEmpty(middleName)) {
                this.familyName = familyName;
                this.givenName = givenName;
                sb.append(givenName + " " + familyName);
            }
            this.familyName = familyName;
            this.givenName = givenName;
            this.middleName = middleName;
            sb.append(givenName + " " + middleName + " " + familyName);
        } else {
            if (isEmpty((middleName))) {
                this.familyName = familyName;
                this.givenName = givenName;
                this.title = title;
                sb.append(title.getTitle() + " " + givenName + " " + familyName);
            } else {
                this.familyName = familyName;
                this.title = title;
                this.givenName = givenName;
                sb.append(title.getTitle() + " " + givenName + " " + middleName + " " +familyName);
            }
        }
        return sb.toString();
    }

    public String concatNameHungarianStyle(String familyName, String middleName, String givenName, Title title) {

        if (isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("isEmpty!");
        }
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;

        sb.append(familyName + " " + middleName + " " + givenName);
        return sb.toString();
    }

    public String insertTitle(String name, Title title, String where) {

        int index = sb.indexOf(where);
        if (index != -1) {
            sb.insert(index, title.getTitle() + name);
        }
        return null;
    }

    public String deleteNamePart(String name, String delete) {

        if (!name.isBlank()) {
            int indexStart = sb.indexOf(name);
            int indexEnd = sb.lastIndexOf(name);
            sb.delete(indexStart, indexEnd+1);
        }
        return null;
    }
}
