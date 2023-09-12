package lesson10_1;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("aaab"));
    }

    static boolean isPalindrome(String s) {
        char[] str = s.toCharArray();
        int left = 0;
        int right = str.length - 1;

        while (left <= right) {
            if (str[left] != str[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
