// import java.util.Scanner;

public class Menu_Atm {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("option's are:");
        // System.out.println("option 1: Check Balance");
        // System.out.println("option 2: Withdraw Money");
        // System.out.println("option 3: Deposit Money");
        // System.out.println("option 4: Exit");
        // System.out.println("Enter your option:");
        // int option = scanner.nextInt();
        // System.out.println("You selected option: " + option);
        int option = 3;

        switch (option) {
            case 1:
                System.out.println("Check Balance");
                break;
            case 2:
                System.out.println("Withdraw Money");
                break;
            case 3:
                System.out.println("Deposit Money");
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}
