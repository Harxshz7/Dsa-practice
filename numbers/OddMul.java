package numbers;

public class OddMul {
    public static void main(String[] args) {
        int no = 948216583;
        int oddMulti = 1;

        while (no != 0) {
            int rem = no % 10;

            if (rem % 2 != 0) {
                oddMulti *= rem;
            }

            no /= 10;
        }

        System.out.println("Product of odd digits in the given number is: " + oddMulti);
    }
}