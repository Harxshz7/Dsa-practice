public class Alpha_Digit_Spchar {
    public static void main(String args[]) {
        char ch = 'H';
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an Alphabet.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Digit.");
        } else {
            System.out.println(ch + " is a Special Character.");
        }
    }
}
