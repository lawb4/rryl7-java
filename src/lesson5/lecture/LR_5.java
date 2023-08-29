package lesson5.lecture;

import java.util.Arrays;

public class LR_5 {
    public static void main(String[] args) {
        int a = 5;
        int b = a;

        b = 10;
        System.out.println(b); // 10

        int[] arr1 = {3, 700, 900}; //reference type
        int[] arr2 = arr1;

        arr2[0] = 300;
        System.out.println(Arrays.toString(arr1)); //arr1[0] = 300
        System.out.println(Arrays.toString(arr2)); //arr2[0] = 300

        String str1 = "sergey";
        str1 = str1.charAt(0) + "emen"; // перезапись (не замена!) строки str1
        System.out.println(str1);

        //
        String str2 = "vasya";
        String str3 = "anna";

        String temp = str2;
        str2 = str3;
        str3 = temp;

        System.out.println(str2);
        System.out.println(str3);

        //
        String str4 = "А роза упала на лапу Азора"; //palindrome
        for (int i = 0; i < str4.length(); i++) {
            // using toLowerCase() to check "case insensitive"
            if (str4.toLowerCase().charAt(i) == 'a') { // a = latin
                System.out.println(i);
            }
            if (str4.toLowerCase().charAt(i) == 'а') { // a = cyrillic
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //
        int a1 = 10;
        int b1 = 10;
        System.out.println(a1 == b1); //true
        //
        String str01 = "sergey";
        String str02 = "anna";
        System.out.println(str01.equals(str02)); //false
    }
}
