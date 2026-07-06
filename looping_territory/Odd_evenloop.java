package looping_territory;

public class Odd_evenloop {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Odd numbers:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println("Even numbers:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
