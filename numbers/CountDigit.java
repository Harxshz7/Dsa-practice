package numbers;

public class CountDigit {
    public static void main(String[] args) {
        int no = 987654321;
        int count = 0;

        while (no != 0) {
            int rem = no % 10;
            count++;
            no /= 10;
        }

        System.out.println("count of digit is " + count);
    }

}
