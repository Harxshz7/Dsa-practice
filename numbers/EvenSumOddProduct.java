package numbers;

public class EvenSumOddProduct {
    public static void main(String[] args) {
        int no = 948216083;
        int evenSum = 0;
        int oddProduct = 1;

        while (no != 0) {
            int rem = no % 10;

            if (rem % 2 == 0) {
                evenSum += rem;
            } else {
                oddProduct *= rem;
            }

            no /= 10;
        }

        System.out.println("Sum of even digits = " + evenSum);
        System.out.println("Product of odd digits = " + oddProduct);
    }
}