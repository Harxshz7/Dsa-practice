public class Even_Odd {
    public static void main(String[] args) {
        int number = 7;

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
        int number1 = 10;
        String result = (number1 % 2 == 0) ? number1 + " is an even number." : number1 + " is an odd number.";
        System.out.println("using ternary operator: " + result);
    }

}
