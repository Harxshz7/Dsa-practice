package numbers;

public class PalNum {
    public static void main(String[] args) {
        int num = 121;
        int rev = 0;
        int no = num;
        while (num != 0) {
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num /= 10;
        }
        if (no == rev) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }

}
