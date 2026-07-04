public class Upper_Lower {
    public static void main(String[] args) {
        char character = 'M';
        if (character >= 'A' && character <= 'Z') {
            System.out.println(character + " is an uppercase letter.");
        } else if (character >= 'a' && character <= 'z') {
            System.out.println(character + " is a lowercase letter.");
        } else {
            System.out.println(character + " is not a letter.");
        }
    }

}
