package numbers;

public class MulDigit {
    public static void main(String[] args) {
        int no = 493;
        int mul = 1;

        while (no != 0) {
            int rem = no % 10;
            mul *= rem;
            no /= 10;
        }

        System.out.println("product of digit is " + mul);
    }
}
