import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStreamTest {

    public static void main(String[] args) {

        System.out.println("case1. array");
        String[] arr = new String[]{"a", "b", "c"};
        for (String str : arr) {
            System.out.println("array : " + str);
        }

        System.out.println("case2. stream");
        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(str -> System.out.println("stream : " + str));

        System.out.println("case3. stream of part");
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
        streamOfArrayPart.forEach(str -> System.out.println("stream of part : " + str));

    }

}
