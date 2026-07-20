package while_territory;
public class slide {
    public static void main(String[] args) {
        String str = "method";
        char[] ch = str.toCharArray();
        int i = 0, j = ch.length - 1;
        while (i > j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j++;
        }
        System.out.println(new String(ch));
    }

}
