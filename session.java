class session {
    public static void main(String[] args) {
        int num = 6;
        if (num >= 2) {
            System.out.println("it is winter");
        } else if (num >= 3 && num <= 5) {
            System.out.println("it is spring");
        } else if (num >= 6 && num <= 8) {
            System.out.println("it is summer");
        } else if (num >= 9 && num <= 11) {
            System.out.println("it is autumn");
        } else {
            System.out.println("it is winter");
        }
    }
}