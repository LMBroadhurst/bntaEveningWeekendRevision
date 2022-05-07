import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Predicates {

    public static void main(String[] args) {
//        Combining a predicate with a lambda gives some super lean code.
        Predicate<Integer> greaterThanFive = (Integer num) -> num > 5;



        String[] streamTest = new String[] {"ax", "bx", "cx"};
        Stream<String> abcStream = Arrays.stream(streamTest);

        boolean check1 = abcStream.anyMatch(element -> element.contains("a"));
//        element -> element.contains("a")

//        boolean check2 = abcStream.allMatch(element -> element.contains("x"));
//          element contains "x"
//
//        boolean check3 = abcStream.anyMatch(element -> element.contains("d"));
//          element contains "d"

        System.out.println(check1);
//        System.out.println(check2);
//        System.out.println(check3);

    }

}
