package numbers;

public class CountEight {
    public static void main(String[] args) {
        int no = 948216083;
        int count = 0;

        while (no != 0) {
            int rem = no % 10;

            if (rem == 8) {
                count++;
            }

            no /= 10;
        }

        System.out.println("Count of digit 8 in the given number is: " + count);
    }
}