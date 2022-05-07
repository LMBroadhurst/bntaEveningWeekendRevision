import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

//        Scanner scanner = new Scanner(System.in);
//
//        String input = scanner.nextLine();
//
//        System.out.println(input);




        File inputFile = new File("src/main/input.txt");

        Scanner fileScanner = new Scanner(inputFile);

        while (fileScanner.hasNext()) {
            System.out.println("There's another line!");

            String input1 = fileScanner.nextLine();

            System.out.println(input1);
        }

    }
}
