public class Pal_While {
    public static void main(String[] args) {
        String str = "level";
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("not a palindrom");
                return;
            }
            i++;
            j--;
        }
        System.out.println("it,s a palindrome");
    }
}
