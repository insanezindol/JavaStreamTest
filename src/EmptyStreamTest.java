import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EmptyStreamTest {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("a", "b", "c");
        Stream<String> stream1 = streamOf(list1);
        stream1.forEach(str -> System.out.println("stream1 str : " + str));

        List<String> list2 = new ArrayList<>();
        Stream<String> stream2 = streamOf(list2);
        stream2.forEach(str -> System.out.println("stream2 str : " + str));

    }

    public static Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }

}
