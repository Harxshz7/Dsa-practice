package user_method;

public class Word_Rev_Instring {
    void spliting() {
        String str = "java is a programming language";
        String[] s1 = str.split(" ");
        for (int i = 0; i < s1.length; i++) {
            System.out.print(this.revers(s1[i]));
            System.out.print(" ");

        }
    }

    String revers(String x) {
        char[] y = x.toCharArray();
        int i = 0, j = y.length - 1;
        while (i < j) {
            char temp = y[i];
            y[i] = y[j];
            y[j] = temp;
            i++;
            j--;
        }
        return new String(y);
    }

    public static void main(String[] args) {
        Word_Rev_Instring w1 = new Word_Rev_Instring();
        w1.spliting();

    }
}
