package week12d01;

public class GradeRounder {

    public int[] roundGrades(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 40) {
                int resultOfDivision = grades[i] / 10;
                int remainder = grades[i] % 10;
                if (remainder == 0) {
                    continue;
                }
                if (remainder < 5 && remainder > 0) {
                    if (((resultOfDivision * 10 + 5) - grades[i]) < 3) {
                        grades[i] = resultOfDivision * 10 + 5;
                    } else {
                        grades[i] = resultOfDivision * 10;
                    }
                } else {
                    if (((resultOfDivision * 10 + 5) - grades[i]) < 3) {
                        grades[i] = resultOfDivision * 10 + 10;
                    } else {
                        grades[i] = resultOfDivision * 10 + 5;
                    }
                }
            }
        }
        return grades;
    }
}
