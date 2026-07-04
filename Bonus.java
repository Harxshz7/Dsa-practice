public class Bonus {
    public static void main(String[] args) {
        int exp = 5;
        double salary = 30000.00;
        if (exp > 5) {
            salary = salary * 0.1 + salary;
            System.out.println("Salary after bonus is: " + salary);
        } else {
            salary = salary * 0.05 + salary;
            System.out.println("Salary after bonus is: " + salary);
        }
    }
}
