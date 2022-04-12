import java.util.stream.Stream;

public class BuilderStreamTest {

    public static void main(String[] args) {

        System.out.println("case1. build");
        Stream<String> builderStream = Stream.<String>builder()
                .add("Eric")
                .add("Elena")
                .add("Java").build();
        builderStream.forEach(str -> System.out.println("build : " + str));

        System.out.println("case2. generate");
        Stream<String> generatedStream = Stream.generate(() -> "gen").limit(5);
        generatedStream.forEach(str -> System.out.println("generate : " + str));

        System.out.println("case3. iterate");
        Stream<Integer> iteratedStream = Stream.iterate(30, n -> n + 2).limit(5);
        iteratedStream.forEach(str -> System.out.println("iterate : " + str));

        System.out.println("case4. concat");
        Stream<String> stream1 = Stream.of("Java", "Scala", "Groovy");
        Stream<String> stream2 = Stream.of("Python", "Go", "Swift");
        Stream<String> concat = Stream.concat(stream1, stream2);
        concat.forEach(str -> System.out.println("concat : " + str));

    }

}
