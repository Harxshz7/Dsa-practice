package numbers;

class SumDigit {
    public static void main(String[] args) {
        int no = 346;
        int sum = 0;

        while (no != 0) {
            int rem = no % 10;
            sum += rem;
            no /= 10;
        }

        System.out.println("sum of digit is " + sum);
    }
}
