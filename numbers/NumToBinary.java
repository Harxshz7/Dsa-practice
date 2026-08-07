package numbers;

public class NumToBinary {
    public static void main(String[] args) {
        int no = 7;
        String result = "";
        while (no > 0) {
            int rem = no % 2;
            result = rem + result;
            no /= 2;
        }
        System.out.println("Binary of 7 is: " + result);
    }
}
