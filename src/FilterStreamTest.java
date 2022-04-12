import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterStreamTest {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Eric", "Elena", "Java");
        Stream<String> stream = names.stream().filter(name -> name.contains("a"));
        stream.forEach(str -> System.out.println("filter : " + str));

    }

}
