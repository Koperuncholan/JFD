import java.util.Scanner;

public class Menu {
    public void display() {
        System.out.println("Grab and Eat.....Place the order");
        System.out.println("Choose 1 for Non-Veg");
        System.out.println("Choose 2 for Veg");
        System.out.println("Choose 3 for Pizza");
        System.out.println("Choose 4 for Exit");
        System.out.println("Select your Favourite one...!");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Tomato tomato = new Tomato();
        tomato.options(choice);
    }
}
