package lesson7.lecture;

public class LR_7 {

    public static double distance(int x1, int y1, int x2, int y2) {
        int deltaX = x2 - x1;
        int deltaY = y2 - y1;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public static void main(String[] args) {
        System.out.println(distance(4, 3, 0, 0));
        //
        Point p1 = new Point(4, 3);
        Point p2 = new Point(0, 0);

        Line line1 = new Line(p1, p2);
        //Line line1 = new Line(new Point(4, 3), new Point(0, 0));
        System.out.println(line1.getLength());
    }
}
