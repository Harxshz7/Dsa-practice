package numbers;

public class Reversedigit {
    public static void main(String[] args) {
        int no = 564;
        int result = 0;

        while (no != 0) {
            int rem = no % 10;
            result = (result * 10) + rem;
            no /= 10;
        }

        System.out.println("reverse of digit is " + result);
    }
}
