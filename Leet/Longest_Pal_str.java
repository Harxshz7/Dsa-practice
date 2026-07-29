package Leet;

public class Longest_Pal_str {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;

            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "aabbad";

        int max = 0;
        String ans = "";

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j <= str.length(); j++) {

                String temp = str.substring(i, j);

                if (isPalindrome(temp) && temp.length() > max) {
                    max = temp.length();
                    ans = temp;
                }
            }
        }

        System.out.println("Longest Palindrome = " + ans);
        System.out.println("Length = " + max);
    }
}