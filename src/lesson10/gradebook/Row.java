package lesson10.gradebook;

import java.util.Arrays;

public class Row {
    private String studentName;
    private Grade[] grades;
    // to bypass `0` if student didn't receive a grade for a lesson

    public Row(String studentName, int numberOfLessons) {
        this.studentName = studentName;
        grades = new Grade[numberOfLessons];
    }

    public String getStudentName() {
        return studentName;
    }

    public Grade[] getGrades() {
        return grades;
    }

    public void giveGrade(int lessonNumber, Grade grade) {
        // so that the 1st lesson is 0 index in array, not `0ed lesson = 0 index`
        grades[lessonNumber - 1] = grade;
    }

    /*@Override
    public String toString() {
        return "Row{" +
                "studentName='" + studentName + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }*/

    @Override
    public String toString() {
        String s = "[ ";
        for (Grade grade : grades) {
            if (grade == null) {
                s += " |";
            } else {
                s += grade.toString() + "|";
            }
        }
        s += " ]";
        return "| " + studentName + s;
    }

    public Integer getFinalGrade() {
        int sum = 0;
        int counter = 0;

        for (int i = 0; i < grades.length; i++) {
            Grade grade = grades[i];
            if (grade != null && grade.getValue() != null) {
                sum += grade.getValue();
                counter++;
            }
        }
        if (counter > 0) {
            return (int) Math.round(sum * 1d / counter);
        } else {
            return null;
        }
    }
}
