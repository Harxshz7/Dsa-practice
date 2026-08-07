package numbers;

public class StrongNum {
    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        int num = 145;
        int sum = 0;
        int temp = num;
        while (num != 0) {
            int rem = num % 10;
            sum += fact(rem);
            num /= 10;
        }
        if (sum == temp) {
            System.out.println(temp + " is a Strong Number");
        } else {
            System.out.println(temp + " is not a Strong Number");
        }
    }
}
