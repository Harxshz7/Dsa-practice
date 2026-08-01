package numbers;

public class SumDiv2ProductDiv3 {
    public static void main(String[] args) {
        int no = 948216083;
        int sum = 0;
        int product = 1;

        while (no != 0) {
            int rem = no % 10;

            if (rem % 2 == 0) {
                sum += rem;
            }

            if (rem != 0 && rem % 3 == 0) {
                product *= rem;
            }

            no /= 10;
        }

        System.out.println("Sum of digits divisible by 2 = " + sum);
        System.out.println("Product of digits divisible by 3 = " + product);
    }
}