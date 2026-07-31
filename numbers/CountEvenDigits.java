package numbers;

public class CountEvenDigits {
    public static void main(String[] args) {
        int no = 948216583;
        int count = 0;

        while (no != 0) {
            int rem = no % 10;

            if (rem % 2 == 0) {
                count++;
            }

            no /= 10;
        }

        System.out.println("Count of even digits in the given number is: " + count);
    }
}