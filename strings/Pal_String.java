package strings;

public class Pal_String {
    public static void main(String[] args) {
        String str = "mom";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equalsIgnoreCase(rev)) {
            System.out.println("given string is palindrom" + "and the string is:" + str);
        } else {
            System.out.println("given string is not an palindrom" + "and the string is:" + str);
        }
    }
}
