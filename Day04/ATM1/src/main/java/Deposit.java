import java.util.Scanner;

public class Deposit {
        Menu menu = new Menu();

        public void dep() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Insert the amount to deposit");
            long amount = sc.nextInt();
            long balance = Utils.initialBalance;
            balance = balance + amount;
            System.out.println("Your Amount is Successfully added");
            Utils.initialBalance = balance;
            System.out.println("Your current balance is : " + Utils.initialBalance);
            menu.display();


        }

    }


