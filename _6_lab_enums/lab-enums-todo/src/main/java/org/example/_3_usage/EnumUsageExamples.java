package org.example._3_usage;

import org.example._2_basics.LogLevel;
import org.example._2_basics.Month;

import java.util.Scanner;

public class EnumUsageExamples {

//     1. use an enum variable in an if-else statement

//    Scanner scanner = new Scanner(System.in);
//    String input = scanner.nextLine();

    public static void main(String[] args) {

        Month birthdayMonth = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birthday month:");

        String input = scanner.nextLine();

        if (input.equals("november")) {
            birthdayMonth = Month.NOVEMBER;
            System.out.println(birthdayMonth + " is my birthday too");
        } else if (input.equals("december")) {
            System.out.println("Santa Claus is coming to town!");
        } else {
            System.out.println("Borrrriiingggggg");
        }

    }


    /*
    2. use of Enum in Switch-Case Statements





    2. use of Enum in Switch-Case Statements (the below example is switch-case an equivalent
    of the if example):

    Directions dir = Directions.EAST;

    switch (dir) {
       case Directions.NORTH:
          System.out.println("North");
          break;

       case Directions.EAST:
          System.out.println("East");
          break;

       case Directions.SOUTH:
          System.out.println("South");
          break;

       default:
          System.out.println("West");
          break;
     }


 */
    /*
        TODO 6 implement the below methods
         and run the tests from org.example._3_usage.EnumUsageExamplesTest to verify your work
     */

    /*
        TODO 6a Implement the method's logic so that getLogLevelMessageUsingIf returns:

        getLogLevelMessageUsingIf(LogLevel.DEBUG)   -> "It's DEBUG!"
        getLogLevelMessageUsingIf(LogLevel.INFO)    -> "It's INFO!"
        getLogLevelMessageUsingIf(LogLevel.WARNING) -> "It's WARNING!"

     */

    /*

        TODO 6b Implement the method's logic so that getLogLevelMessageUsingSwitchCase returns:
        getLogLevelMessageUsingSwitchCase(LogLevel.DEBUG)   -> "It's DEBUG!"
        getLogLevelMessageUsingSwitchCase(LogLevel.INFO)    -> "It's INFO!"
        getLogLevelMessageUsingSwitchCase(LogLevel.WARNING) -> "It's WARNING!"

     */

    String getLogLevelMessageUsingSwitchCase(LogLevel logLevel) {
    //   pass the variable to a switch-case statement to return a specific message
        return "";
    }

    public String getLogLevelMessageUsingIf(LogLevel logLevel) {
        return "";
    }
}
