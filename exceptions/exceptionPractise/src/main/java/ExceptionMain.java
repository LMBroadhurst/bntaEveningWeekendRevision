import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;

public class ExceptionMain {

//    TRY: Allows you to define a block of code to be tested for errors while it is being executed.
//    CATCH: If the error is caught in the TRY statement, the code in the CATCH block is executed.

//    CHECKED EXCEPTIONS...
//    Represent errors that are outside of the control of the program. This may include a necessary file not being
//    found, an incorrect input,

    public static void main(String[] args) {

        File file = new File("File.txt");

        try {
            FileInputStream stream = new FileInputStream(file);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        System.out.println("Code keeps running and prints this line :)");

    }


//    When we write a method with a throws FileNotFoundException, we are telling the method which calls this method
//    that it may have to deal with this error.
    public void readFile() throws FileNotFoundException {
        File file = new File("file.txt");
        FileInputStream stream = new FileInputStream(file);
    }

//    UNCHECKED EXCEPTIONS
//    Cannot be checked with a try/catch block because it is an issue with the logic of the code. Not an input or file.
    public void codeWithError() {
        int badMaths = 10 / 0;
//        intelliJ is showing us with the yellow highlighting that the arithmetic is incorrect.
    }

}
