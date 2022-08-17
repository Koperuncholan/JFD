import java.util.*;

public class Atm {
    Menu menu = new Menu();
    private long balance = 0;
    void options(int choice) {
        if (choice > 0 && choice < 5) {
            switch (choice) {
                case 1:
                    Withdraw withdraw = new Withdraw();
                    withdraw.draw();
                    balance = Utils.initialBalance;

                    break;
                case 2:
                    Deposit deposit = new Deposit();
                    deposit.dep();
                    break;
                case 3:
                    Balance balance = new Balance();
                    balance.bal();
                    break;
                case 4:
                    System.out.println(" * * * Thankyou For Visiting * * * ");
                    break;
            }
        } else {
            System.out.println("Please Enter Valid Input!");
            menu.display();
        }
    }
    public static void main(String[] args) {
        //
        Menu menu = new Menu();
        menu.display();
        Withdraw withDraw = new Withdraw();
        Deposit deposit = new Deposit();
        Balance balance = new Balance();

    }
}


