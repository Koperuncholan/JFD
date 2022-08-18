public class Tomato {
    Menu menu = new Menu();

    void options(int choice) {
        if (choice < 0 && choice < 5) {
            switch (choice) {
                case 1:
                    Tomato tomato = new Tomato();
                    tomato.nv();

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }
    }

    private void nv() {
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.display();
    }
}

    
