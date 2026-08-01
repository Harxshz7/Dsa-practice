package numbers;

public class MulDivBy4 {
    public static void main(String[] args) {
        int no = 948216083;
        int product = 1;

        while (no != 0) {
            int rem = no % 10;

            if (rem != 0 && rem % 4 == 0) {
                product *= rem;
            }

            no /= 10;
        }

        System.out.println("Product of digits divisible by 4 = " + product);
    }
}