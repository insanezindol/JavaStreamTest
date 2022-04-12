import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class TypeStreamTest {

    public static void main(String[] args) throws Exception {

        System.out.println("case1. IntStream");
        IntStream intStream = IntStream.range(1, 5); // [1, 2, 3, 4]
        intStream.forEach(num -> System.out.println("IntStream : " + num));

        System.out.println("case2. LongStream");
        LongStream longStream = LongStream.rangeClosed(1, 5); // [1, 2, 3, 4, 5]
        longStream.forEach(num -> System.out.println("LongStream : " + num));

        System.out.println("case3. boxedIntStream");
        Stream<Integer> boxedIntStream = IntStream.range(1, 5).boxed();
        boxedIntStream.forEach(num -> System.out.println("boxedIntStream : " + num));

        System.out.println("case4. randomStream");
        IntStream integers = new Random().ints(3);
        LongStream longs = new Random().longs(3);
        DoubleStream doubles = new Random().doubles(3);
        integers.forEach(num -> System.out.println("IntStream : " + num));
        longs.forEach(num -> System.out.println("LongStream : " + num));
        doubles.forEach(num -> System.out.println("DoubleStream : " + num));

        System.out.println("case5. String Stream");
        IntStream charsStream = "Stream".chars();
        charsStream.forEach(num -> System.out.println("charsStream : " + num));
        Stream<String> stringStream = Pattern.compile(", ").splitAsStream("Eric,Elena,Java");
        stringStream.forEach(str -> System.out.println("stringStream : " + str));


        System.out.println("case6. File Stream");
        Stream<String> lineStream = Files.lines(Paths.get("file.txt"), Charset.forName("UTF-8"));
        lineStream.forEach(line -> System.out.println("read file line : " + line));

    }

}
