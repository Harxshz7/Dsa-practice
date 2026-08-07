package numbers;

public class Facto {
    public static void main(String[] args) {
        int no = 5;
        int fact = 1;

        for (int i = 1; i <= no; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + no + " is " + fact);
    }
}
