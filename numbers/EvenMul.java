package numbers;

public class EvenMul {
    public static void main(String[] args) {
        int no = 948216083;
        int evenMulti = 1;

        while (no != 0) {
            int rem = no % 10;

            if (rem != 0 && rem % 2 == 0) {
                evenMulti *= rem;
            }

            no /= 10;
        }

        System.out.println("Product of non-zero even digits is: " + evenMulti);
    }
}