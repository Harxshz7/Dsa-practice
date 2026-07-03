class FizzBuzz {
    public static void main(String[] args) {
        int num = 37;
        if (num % 3 == 0 && num % 7 == 0) {
            System.out.println("fizzbuzz");
        } else if (num % 3 == 0) {
            System.out.println("fizzfizz");
        } else if (num % 7 == 0) {
            System.out.println("buzzbuzz");
        } else {
            System.out.println(num);
        }
    }
}