public class Grade {
    public static void main(String[] args) {
        int marks = 85;
        if (marks >= 90) {
            System.out.println("You have received an A grade.");
        } else if (marks >= 80) {
            System.out.println("You have received  B grade.");
        } else if (marks >= 70) {
            System.out.println("You have received  C grade.");
        } else if (marks >= 60) {
            System.out.println("You have received  D grade.");
        } else {
            System.out.println("You have failed the exam.");
        }
    }
}
