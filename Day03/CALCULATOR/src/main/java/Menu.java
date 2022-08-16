import java.util.Arrays;

public class Menu {
    public void displayMenu() {
        for (String s : Arrays.asList("1.Add", "2.Sub", "3.mul", "4.div", "5.mod")) {
            System.out.println(s);
        }

    }

}
