package codingWithJohn;

public class Lambdas {

    public static void main(String[] args) {

        Cat myCat = new Cat();
        myCat.print();

//        Instead of calling the cat object and the print method, we can...

        printThing(myCat);

//        Now we can think about how we can shorten this down. Lets pass the whole print method from the Cat class.
//        Instead of passing in an object that contains a specific implementation of the print method...
//        We're just passing in the specific implementation of the method directly.

        /*
        printThing(
        public void print() {
            System.out.println("Meow.");
        }
        );
         */

//        Now to clean it up...

        printThing(
                (suffix) -> {
                    System.out.println("Meow.");
                });

//        Instead of sending in an object that contains an action, we are just sending in the action itself.
//        The expression becomes the object itself if we assign it to a variable.

        Printable lambdaPrintable = (suffix) -> System.out.println("Meow" + suffix);
        printThing(lambdaPrintable);

    }

    static void printThing(Printable thing) {
        thing.print("!");
    }

}
