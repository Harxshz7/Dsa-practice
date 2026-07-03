public class Big_among3 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the largest number.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the largest number.");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " is the largest number.");
        } else {
            System.out.println("There is a tie among the numbers.");
        }
    }

}
