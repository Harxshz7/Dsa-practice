package strings;

public class String_f {
    public static void main(String[] args) {
        String str = "MeThodOverLoAdiNG";
        System.out.println("uppercase:" + str.replaceAll("[^a-z]", ""));
        System.out.println("lowercase:" + str.replaceAll("[^A-Z]", ""));
        System.out.println("consonants:" + str.replaceAll("[^aeiouAEIOU]", ""));
        System.out.println("vowels:" + str.replaceAll("[aeiouAEIOU]", ""));
        System.out.println("total number of characters:" + str.length());
        System.out.println("total number of vowels:" + str.replaceAll("[^aeiouAEIOU]", "").length());
        System.out.println("total number of consonants:" + str.replaceAll("[aeiouAEIOU]", "").length());
        System.out.println("total number of uppercase:" + str.replaceAll("[^A-Z]", "").length());
        System.out.println("total number of lowercase:" + str.replaceAll("[^a-z]", "").length());
    }

}
