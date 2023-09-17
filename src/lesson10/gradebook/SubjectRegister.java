package lesson10.gradebook;

public class SubjectRegister {
    private Row[] rows;
    private boolean isLocked = true;

    public SubjectRegister(String[] studentNames, int numberOfClasses) {
        rows = new Row[studentNames.length];
        for (int i = 0; i < studentNames.length; i++) {
            Row row = new Row(studentNames[i], numberOfClasses);
            rows[i] = row;
        }
    }

    // my method implementation before lecture explanation
    public void myPrintAllStudentNames() {
        int counter = 0;
        for (Row row : this.rows) {
            if (row.getStudentName() != null) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public int getNumberOfStudentNames() {
        return this.rows.length;
    }

    public void giveGrade(String studentName, int lessonNumber, int grade) {
        giveGrade(studentName, lessonNumber, new Grade(grade));
    }

    public void giveGrade(String studentName, int lessonNumber, Grade grade) {

        if (checkIsLocked()) {
            return;
        }

        Row row = findByName(studentName);
        if (row != null) {
            row.giveGrade(lessonNumber, grade);
            System.out.println(studentName + " gets " + "`" + grade.toString() + "`");
        } else {
            System.out.println("Can't find student " + studentName);
        }
    }

    // `private` so that it can be executed with `SubjectRegister` only
    private Row findByName(String studentName) {
        for (Row row : rows) {
            if (row.getStudentName().equalsIgnoreCase(studentName)) {
                return row;
            }
        }
        return null;
    }

    public void print() {
        System.out.println("====================================");
        System.out.println("Printing the SubjectRegister");
        System.out.println("====================================");
        for (Row row : rows) {
            System.out.println(row.toString());
        }
        System.out.println("====================================");
    }

    public void unlock() {
        isLocked = false;
    }

    public void lock() {
        isLocked = true;
    }

    private boolean checkIsLocked() {
        if (isLocked) {
            System.out.println("This register is LOCKED! You cannot make any changes right now.");
        }
        return isLocked;
    }

    public Integer getFinalGrade(String studentName) {
        Row row = findByName(studentName);
        if (row != null) {
            return row.getFinalGrade();
        } else {
            System.out.println("Can't find student " + studentName);
        }
        return null;
    }

    /* my grade check implementation is grades are stored in Integers, not a separate Grade class
    private boolean checkIsGradeValidForStudent(String studentName, Integer grade) {
        boolean isGradeValid = true;
        if (grade < 1 || grade > 5) {
            System.out.println("Grade " + grade + " for " + studentName
                    + " is not in range [1..5] so it will NOT be put in the register");
            isGradeValid = false;
        }
        return isGradeValid;
    }*/
}
