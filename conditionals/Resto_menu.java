public class Resto_menu {
    public static void main(String[] args) {
        int pizza = 50;
        int burger = 30;
        int sandwich = 20;
        int coffee = 10;
        if (pizza > 0) {
            System.out.println("Pizza: $50");
        }
        if (burger > 0) {
            System.out.println("Burger: $30");
        }
        if (sandwich > 0) {
            System.out.println("Sandwich: $20");
        }
        if (coffee > 0) {
            System.out.println("Coffee: $10");
        }
        else{
            System.out.println("No items available");
        }
    }
}
