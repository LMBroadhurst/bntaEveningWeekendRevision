import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamBasics {
//    Used for processing a sequence of items within an ARRAY.

    public static void main(String[] args) {
//        Here we have a list of letters, which is converted into a stream.

//        String[] streamTest = new String[] {"a", "b", "c"};
//        Stream<String> abcStream = Arrays.stream(streamTest);

//        abcStream.forEach(System.out::println);

//        long count = abcStream.count();
//        System.out.println(count);


//        Streams are consumed on use (Single Use).
//        A way to overcome this is to create a *SUPPLIER* for the stream, by creating a lambda.
        String[] streamTest = new String[] {"a", "b", "c"};
        Supplier<Stream> abcStream = () -> Arrays.stream(streamTest);

        abcStream.get().forEach(System.out::println);

//        The supplier becomes a functional interface which houses only this one method to invoke other functionality.

    }
}
