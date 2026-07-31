package numbers;

public class EvenSum {
    public static void main(String[] args) {
        int no = 948216083;
        int evensum = 0;

        while (no != 0) {
            int rem = no % 10;
            if (rem % 2 == 0) {
                evensum += rem;
            }
            no /= 10;
        }

        System.out.println("sum of even number digit in given number is " + evensum);
    }
}
