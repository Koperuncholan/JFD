import java.util.*;

public class Atm {
    public static void main(String[] args) {
        long initialBalance = 100_000;
        Menu menu = new Menu();
        Withdraw draw = new Withdraw();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            menu.display();
            System.out.println("Enter Your Choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println(" * * * Thankyou For Visiting * * * ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please Enter Valid Input");
                    break;

            }
        }
        while (choice > 0 && choice < 5);
        System.out.println(" * * * Thankyou For Visiting * * * ");
    }
}
