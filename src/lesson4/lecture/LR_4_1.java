package lesson4.lecture;

public class LR_4_1 {
    public static void main(String[] args) {

        boolean itMoves = true;
        boolean shouldItMove = false;

        if (itMoves == shouldItMove) {
            System.out.println("No problem!");
        } else if (itMoves) {
            System.out.println("Use duct tape");
        } else {
            System.out.println("Use WD-40");
        }
    }
}
