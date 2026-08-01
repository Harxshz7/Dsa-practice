package numbers;

public class CountDivisibleBy4 {
    public static void main(String[] args) {
        int no = 948216083;
        int count = 0;

        while (no != 0) {
            int rem = no % 10;

            if (rem % 4 == 0) {
                count++;
            }

            no /= 10;
        }

        System.out.println("Count of digits divisible by 4 is: " + count);
    }
}