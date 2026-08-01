package numbers;

public class SumDivisibleBy2 {
    public static void main(String[] args) {
        int no = 948216083;
        int sum = 0;

        while (no != 0) {
            int rem = no % 10;

            if (rem % 2 == 0) {
                sum += rem;
            }

            no /= 10;
        }

        System.out.println("Sum of digits divisible by 2 is: " + sum);
    }
}