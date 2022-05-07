import java.util.Scanner;

public class BasicScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String coffee = null;
        boolean run = true;

        while (run) {

            System.out.println("Welcome to the Coffee Shop! Would you like a drink?");
            String input = scanner.nextLine();

            if (input.equals("yes")) {
                System.out.println("What coffee would you like?");
                coffee = scanner.nextLine();
            } else if (input.equals("no")){
                System.out.println("Cya");
                run = false;
            } else {
                System.out.println("Uh uh uh");
                run = false;
            }

            if (coffee.equals("americano")) {
                System.out.println("Good choice");
            }

        }


    }

}
