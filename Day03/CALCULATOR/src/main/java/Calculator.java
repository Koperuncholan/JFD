import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Calculation calc = new Calculation();
        menu.displayMenu();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice = scanner.nextInt();
        if (choice > 5 || choice < 0) {
            System.out.println("Invalid");
        } else {
            switch (choice) {
                case 1:
                    System.out.println("Result :" + calc.add());
                    break;
                case 2:
                    System.out.println("Result :" + calc.sub());
                    break;
                case 3:
                    System.out.println("Result :" + calc.mul());
                    break;
                case 4:
                    System.out.println("Result :" + calc.div());
                    break;
                case 5:
                    System.out.println(calc.mod());
                    break;
            }
    }

}
}
