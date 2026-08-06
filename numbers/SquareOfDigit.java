package numbers;

public class SquareOfDigit {
    public static void main(String[] args) {
        int num = 3287;
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum += rem * rem;
            num /= 10;
        }
        System.out.println("the sum of square of digits is: " + sum);
    }
}
