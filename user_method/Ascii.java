package user_method;

public class Ascii {
    public static void main(String[] args) {
        String input = "hello";
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            ch = (char) (ch + 4);
            output += ch;
        }
        System.out.println("given in put id:" + input);
        System.out.println("the out put is:" + output);
    }
}
