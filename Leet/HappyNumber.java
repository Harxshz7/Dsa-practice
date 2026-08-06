package Leet;

public class HappyNumber {
    public static int numsum(int num) {
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum += rem * rem;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int no = 19;

        while (no > 9) {
            no = numsum(no);
        }
        if (no == 1 || no == 7) {
            System.out.println("The number is a happy number");
        } else {
            System.out.println("The number is not a happy number");
        }

    }
}
