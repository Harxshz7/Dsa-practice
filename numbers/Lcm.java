package numbers;

public class Lcm {
    public static void main(String[] args) {
        int num1 = 12, num2 = 15;
        int lcm;
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        lcm = (num1 * num2) / gcd;

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
