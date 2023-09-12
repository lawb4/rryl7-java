package lesson10.gradebook;

public class Grade {
    private Integer value;

    public Grade (int grade) {
        if (grade < 1 || grade > 5) {
            System.out.println("Grade must be in range [1..5]. Incorrect grade will be considered as `null`");
            this.value = null;
        } else {
            this.value = grade;
        }
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        if (value == null) {
            return "?";
        } else {
            return value.toString();
        }
    }
}
