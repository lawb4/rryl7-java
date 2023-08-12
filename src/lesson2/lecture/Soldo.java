package lesson2.lecture;

public class Soldo {
    public static void main(String[] args) {
        int lancers = 120;
        int doppelsoldner = 30;
        int lieutenants = 2;
        int captains = 1;

        int baseSalary = 4;
        int lancerSalary = baseSalary;
        int doppelSalary = 2 * baseSalary;
        int lietSalary = 10 * baseSalary;
        int captainSalary = 100 * baseSalary;

        System.out.print("Total Salary: ");
        System.out.println(
                lancers * baseSalary
                + doppelsoldner * doppelSalary
                + lieutenants * lietSalary
                + captains * captainSalary);
    }
}
