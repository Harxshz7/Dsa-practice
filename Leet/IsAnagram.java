package Leet;

public class IsAnagram {

    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] arr = new int[127];

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            arr[ch]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            arr[ch]--;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String str1 = "abbc";
        String str2 = "babc";

        if (isAnagram(str1, str2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}