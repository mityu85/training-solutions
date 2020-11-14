package stringmethods.filename;

public class FileNameManipulator {

    private boolean isEmpty(String fileName) {

        if (fileName.isBlank() || fileName == null || fileName.isEmpty()) {
            return true;
        }
        return false;
    }

    public char findLastCharacter(String str) {

        if (isEmpty(str)) {
            throw new IllegalArgumentException("Empty string!");
        }
        int strLastIndex = str.lastIndexOf(str);
        return str.charAt(strLastIndex);
    }

    public String findFileExtension(String fileName) {

        if (fileName.contains(".") && !isEmpty(fileName)) {
            int fileNameIndex = fileName.indexOf(".");
            int fileNameLenght = fileName.length();
            if (fileName.substring(fileNameIndex, fileNameLenght).length() <= 4) {
                return fileName.substring(fileNameIndex, fileNameLenght);
            } else {
                throw new IllegalArgumentException("Invalid argument!");
            }
        }
        throw new IllegalArgumentException("Empty string!");
    }

    public boolean identifyFilesByExtension(String ext, String fileName) {

        if (ext.length() <= 4) {
            return true;
        }
        return false;
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {

        if (isEmpty(searchedFileName)) {
            throw new IllegalArgumentException("Empty string!");
        } else {
            return searchedFileName.equals(actualFileName);
        }
    }

    public String changeExtensionToLowerCase(String fileName) {

        if (isEmpty(fileName) || fileName.equals(".")) {
            throw new IllegalArgumentException("Empty string!");
        }
        return findFileExtension(fileName).toLowerCase();
    }

    public String replaceStringPart(String fileName, String present, String target) {
        String str;
        if (isEmpty(fileName)) {
            throw new IllegalArgumentException("Empty string!");
        } else {
            str = fileName.replace(present, target);
        }
        return str;
    }
}
