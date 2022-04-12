import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionStreamTest {

    public static void main(String[] args) {

        System.out.println("case1. list");
        List<String> list = Arrays.asList("a", "b", "c");
        for (String str : list) {
            System.out.println("list : " + str);
        }

        System.out.println("case2. stream");
        Stream<String> stream = list.stream();
        stream.forEach(str -> System.out.println("stream : " + str));

        System.out.println("case3. parallel stream");
        Stream<String> parallelStream = list.parallelStream(); // 병렬 처리 스트림
        parallelStream.forEach(str -> System.out.println("parallel stream : " + str));

    }

}
