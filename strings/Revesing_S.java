package strings;

public class Revesing_S {
    public static void main(String[] args) {
        String given = "java";
        String rev = "";

        System.out.println("given string is:" + given);
        for (int i = given.length() - 1; i >= 0; i--) {
            rev = rev + given.charAt(i);
        }
        System.out.println("the reversed string is :" + rev);
    }
}
