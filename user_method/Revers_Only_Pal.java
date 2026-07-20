package user_method;

public class Revers_Only_Pal {
    static void revers(String x) {
        int i = 0, j = x.length() - 1;
        char[] y = x.toCharArray();
        while (i < j) {
            if (y[i] != y[j]) {
                System.out.println(x + " is not a palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println(x + " is a palindrome");
    }

    public static void main(String[] args) {
        String str = "mom knows malayalam she is from katak place which is in gadag place";
        String[] s1 = str.split(" ");
        for (int i = 0; i < s1.length; i++) {
            revers(s1[i]);
        }

    }
}
