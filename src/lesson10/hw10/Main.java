package lesson10.hw10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Convert boolean values to strings 'Yes' or 'No'.
        System.out.println("Convert boolean values to strings 'Yes' or 'No'");
        System.out.println(convertBooleanToString(true));
        System.out.println(convertBooleanToString(false));
        //Basic Mathematical Operations
        System.out.println("Basic Mathematical Operations");
        System.out.println(basicMath("+", 4, 7));
        System.out.println(basicMath("-", 15, 18));
        System.out.println(basicMath("*", 5, 5));
        System.out.println(basicMath("/", 49, 7));
        //Reversed sequence
        System.out.println("Reversed sequence");
        System.out.println(Arrays.toString(reverse(5)));
        //Convert a string to an array
        System.out.println("Convert a string to an array");
        System.out.println(Arrays.toString(stringToArray("Robin Singh")));
        System.out.println(Arrays.toString(stringToArray("I love arrays they are my favorite")));
        //Correct the mistakes of the character recognition software
        System.out.println("Correct the mistakes of the character recognition software");
        System.out.println(correct("1F-RUDYARD K1PL1NG"));
        System.out.println(correct("R1CHARD P. FEYNMAN - THE FEYNMAN LECTURE5 0N PHY51C5"));
        System.out.println(correct("J. K. R0WL1NG - HARRY P0TTER AND THE PH1L050PHER'5 5T0NE"));
        System.out.println(correct("R1CHARD P. FEYNMAN - THE FEYNMAN LECTURE5 0N PHY51C5"));
        System.out.println(correct("UR5ULA K. LE GU1N - A W1ZARD 0F EARTH5EA"));
    }


    /* https://www.codewars.com/kata/53369039d7ab3ac506000467
    Convert boolean values to strings 'Yes' or 'No'.

    Complete the method that takes a boolean value and
    return a "Yes" string for true, or a "No" string for false.*/

    public static String convertBooleanToString(boolean b) {
        return b ? "Yes" : "No";
    }

    /*
    https://www.codewars.com/kata/57356c55867b9b7a60000bd7
    Basic Mathematical Operations
    Your task is to create a function that does four basic mathematical operations.

    The function should take three arguments - operation(string/char), value1(number), value2(number).
    The function should return result of numbers after applying the chosen operation.
    Examples(Operator, value1, value2) --> output

            ('+', 4, 7) --> 11
            ('-', 15, 18) --> -3
            ('*', 5, 5) --> 25
            ('/', 49, 7) --> 7
    */
    public static Integer basicMath(String op, int v1, int v2) {
        Integer result = 0;

        if (op.equals("+")) {
            return v1 + v2;
        }
        if (op.equals("-")) {
            return v1 - v2;
        }
        if (op.equals("*")) {
            return v1 * v2;
        }
        if (op.equals("/")) {
            return v1 / v2;
        }
        return result;

        // 2nd variant
        /*switch (op) {
            case "-":
                return v1 - v2;
            case "+":
                return v1 + v2;
            case "*":
                return v1 * v2;
            case "/": {
                if (v2 == 0)
                    throw new IllegalArgumentException("Division by zero");
                return v1 / v2;
            }
            default:
                throw new IllegalArgumentException("Unknown operation: " + op);
        }*/
    }

    /*
    https://www.codewars.com/kata/5a00e05cc374cb34d100000d
    Reversed sequence
    Build a function that returns an array of integers from n to 1 where n>0.

    Example : n=5 --> [5,4,3,2,1]
    */
    public static int[] reverse(int n) {
        int[] arr = new int[n];
        int[] arr1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[arr.length - i - 1];
        }
        return arr1;
    }

    /*
    https://www.codewars.com/kata/57e76bc428d6fbc2d500036d
    Convert a string to an array
    Write a function to split a string and convert it into an array of words.
    Examples (Input ==> Output):

    "Robin Singh" ==> ["Robin", "Singh"]

    "I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]
    */
    public static String[] stringToArray(String s) {
        return s.split("\\s");
    }

    /*
    https://www.codewars.com/kata/577bd026df78c19bca0002c0
    Correct the mistakes of the character recognition software

    Character recognition software is widely used to digitise printed texts. Thus, the texts can be edited, searched and stored on a computer.

    When documents (especially pretty old ones written with a typewriter), are digitised character recognition softwares often make mistakes.

    Your task is correct the errors in the digitised text. You only have to handle the following mistakes:

    S is misinterpreted as 5
    O is misinterpreted as 0
    I is misinterpreted as 1

    The test cases contain numbers only by mistake.
    */
    public static String correct(String string) {
        char[] result = string.toCharArray();

        for (int i = 0; i < result.length; i++) {
            if (result[i] == '5') {
                result[i] = 'S';
            }
            if (result[i] == '0') {
                result[i] = 'O';
            }
            if (result[i] == '1') {
                result[i] = 'I';
            }
        }
        return new String(result);
        //return string.replace("5","S").replace("0", "O").replace("1","I");
    }
}
