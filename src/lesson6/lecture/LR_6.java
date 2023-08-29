package lesson6.lecture;

public class LR_6 {
    public static void main(String[] args) {

        //matrix
        int[][] arr1 = {
                {1, 2, 3},
                {11, 22, 33, 44, 55},
                {111, 222, 333},
                {},
                {444}
        };

        System.out.println(arr1[0][0]); //1
        System.out.println(arr1[0][1]); //2
        System.out.println(arr1[0][2]); //3
        System.out.println(arr1[2][0]); //111

        System.out.println();
        //nested loop
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //find the max value in nested loop
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] > max) {
                    max = arr1[i][j];
                }
            }
        }
    }
}
