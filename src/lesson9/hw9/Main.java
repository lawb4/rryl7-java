package lesson9.hw9;

public class Main {
    public static void main(String[] args) {
        // 1 - Abbreviate Two Words
        System.out.println("=== Abbreviate Two Words ===");
        System.out.println(abbreviateTwoWords("sam harris"));
        System.out.println(abbreviateTwoWords("patrick feeney"));
        // 2 - The Feast of Many Beasts
        System.out.println("=== The Feast of Many Beasts ===");
        System.out.println(theFeastOfManyBeasts("great blue heron", "garlic naan"));
        System.out.println(theFeastOfManyBeasts("chickadee", "chocolate cake"));
        System.out.println(theFeastOfManyBeasts("brown bear", "bear claw"));
        // 3 - Triple Trouble
        System.out.println("=== Triple Trouble ===");
        System.out.println(tripleTrouble("this", "test", "lock"));
        System.out.println(tripleTrouble("aa", "bb", "cc"));
        System.out.println(tripleTrouble("Bm", "aa", "tn"));
        System.out.println(tripleTrouble("LLh", "euo", "xtr"));
        // 4 - Find Position
        System.out.println(findPosition('a'));
        System.out.println(findPosition('z'));
        System.out.println(findPosition('e'));
        // 5 - Array plus array
        System.out.println(arrayPlusArray(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
        System.out.println(arrayPlusArray(new int[]{-1, -2, -3}, new int[]{-4, -5, -6}));
        System.out.println(arrayPlusArray(new int[]{0, 0, 0}, new int[]{4, 5, 6}));
        System.out.println(arrayPlusArray(new int[]{100, 200, 300}, new int[]{400, 500, 600}));
    }

    /*
    https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3
    Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.

    The output should be two capital letters with a dot separating them.
    It should look like this:
    Sam Harris => S.H
    patrick feeney => P.F
    */
    public static String abbreviateTwoWords(String name) {
        String result = name.toUpperCase().charAt(0) + ".";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                result += name.toUpperCase().charAt(i + 1);
            }
        }
        return result;
    }

    /*
    https://www.codewars.com/kata/5aa736a455f906981800360d
    All the animals are having a feast! Each animal is bringing one dish.
    There is just one rule: the dish must start and end with the same letters as the animal's name.
    For example, the great blue heron is bringing garlic naan and the chickadee is bringing chocolate cake.

    Write a function feast that takes the animal's name and dish as arguments and returns true or false to indicate
    whether the beast is allowed to bring the dish to the feast.

    Assume that beast and dish are always lowercase strings, and that each has at least two letters.
    beast and dish may contain hyphens and spaces, but these will not appear at the beginning or end of the string.
    They will not contain numerals.
    */
    public static boolean theFeastOfManyBeasts(String beast, String dish) {

        boolean isStartsWithSameChar = beast.toLowerCase().charAt(0)
                == dish.toLowerCase().charAt(0);
        boolean isEndWithSameChar = beast.toLowerCase().charAt(beast.length() - 1)
                == dish.toLowerCase().charAt(dish.length() - 1);

        return isStartsWithSameChar && isEndWithSameChar;
    }

    /*
    https://www.codewars.com/kata/5704aea738428f4d30000914
    Triple Trouble

    Create a function that will return a string that combines all the letters of the three inputted strings in groups.
    Taking the first letter of all the inputs and grouping them next to each other.
    Do this for every letter, see example below!

    E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"

    Note: You can expect all the inputs to be the same length.
    */

    public static String tripleTrouble(String one, String two, String three) {
        StringBuilder result = new StringBuilder();
        // assuming all the inputs have the same length,
        // place the 1st input in for loop
        for (int i = 0; i < one.length(); i++) {
            result.append(one.charAt(i))
                    .append(two.charAt(i))
                    .append(three.charAt(i));
        }
        return result.toString();
    }

    /*
    https://www.codewars.com/kata/5808e2006b65bff35500008f
    Find the Position!

    When provided with a letter, return its position in the alphabet.
    Input : "a"
    Output : "Position of alphabet: 1"
    */
    public static String findPosition(char alphabet) {
        String result = "Position of alphabet: ";
        // assuming input is a lowercase char
        int position = alphabet - 'a' + 1;
        return result + position;

        // 2nd variant
        /*
        Inside the method, it calculates the position of the character in the alphabet by
        subtracting the Unicode code point of the backtick character ('')
        from the Unicode code point of the given character (alphabet).
        The backtick character ('') has a lower Unicode code point than any of the lowercase letters,
        so this calculation effectively maps the character to its position in the alphabet.

         return "Position of alphabet: " + (alphabet - '`')
        */
    }

    /*
    https://www.codewars.com/kata/5a2be17aee1aaefe2a000151
    Array plus array
    I'm new to coding and now I want to get the sum of two arrays...
    Actually the sum of all their elements. I'll appreciate for your help.

    P.S. Each array includes only integer numbers. Output is a number too.
    */
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int result = 0;

        for (int i : arr1) {
            result += i;
        }

        for (int i : arr2) {
            result += i;
        }

        return result;
    }
}
