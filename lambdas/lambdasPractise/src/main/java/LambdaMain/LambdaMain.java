package LambdaMain;

import java.sql.SQLOutput;

public class LambdaMain {

    public static void main(String[] args) {

//        Footballer lewisB = new Footballer("Lewis", 27, "Solihull Moors");

//        lewisB.run();

//        Using a lambda, we can call Run as an object and set it to a variable that we can call.
//        We no longer need to instantiate the Footballer object, call the run method, or specify a method
//        in Footballer.

        Run footballerRuns = () -> System.out.println("Runs with ball at feet 2...");
        move(footballerRuns);

//        To reduce the amount of code even further, we can remove the variable and place the method directly
//        into the move method.
//        Now the code is looking clean as.

        move(() -> System.out.println("Runs with ball in hands 2..."));


//        Now to create some new methods, Kick.
        kickBall(() -> System.out.println("Kicks round ball"));

        kickBall(() -> System.out.println("Kicks ovalish ball"));


//        Now to do OOP with lambdas.

    }

    static void move(Run x) {
        x.run();
    }

    static void kickBall(Kick x) {
        x.kick();
    }





}
