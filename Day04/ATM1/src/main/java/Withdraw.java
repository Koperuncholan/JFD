import jdk.jshell.execution.Util;

import java.util.Scanner;

public class Withdraw {
    Menu menu = new Menu();
    public void draw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount");
        long amount = sc.nextInt();
        long balance = Utils.initialBalance;
        if (amount < balance) {
            balance = balance - amount;
            System.out.println("Successfully withdrawl");
            Utils.initialBalance = balance;
            System.out.println("Your current balance is : " + Utils.initialBalance);
            menu.display();
        } else {
            System.out.println("Insufficient Amount");
            menu.display();

        }
    }
}
