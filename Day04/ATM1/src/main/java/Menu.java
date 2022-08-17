import java.util.Scanner;
import java.util.*;
public class Menu {
    public void display() {
        System.out.println("Welcome to ATM ");
        System.out.println("Choose 1. For Withdraw money");
        System.out.println("Choose 2. For Deposit");
        System.out.println("Choose 3. For Balance");
        System.out.println("Choose 4. For Exit");
        System.out.println("Enter Your Choice : ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        Atm at = new Atm();
        at.options(choice);
    }
}

