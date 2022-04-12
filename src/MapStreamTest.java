import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapStreamTest {

    public static void main(String[] args) {

        System.out.println("case1. Map Stream");
        List<String> names = Arrays.asList("Eric", "Elena", "Java");
        Stream<String> nameStream = names.stream().map(String::toUpperCase);
        nameStream.forEach(str -> System.out.println("name : " + str));

        System.out.println("case2. Person Map Stream");
        List<Person> personList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            personList.add(new Person(UUID.randomUUID().toString(), rand.nextInt(100), rand.nextInt(100) + 100));
        }
        Stream<Integer> ageStream = personList.stream().map(Person::getAge);
        ageStream.forEach(age -> System.out.println("age : " + age));

        System.out.println("case3. Flat Map Stream");
        // [[a], [b]]
        List<List<String>> list = Arrays.asList(Arrays.asList("a"), Arrays.asList("b"));
        System.out.println("list : " + list);
        // [a, b]
        List<String> flatList = list.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println("flatList : " + flatList);


        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            students.add(new Student(UUID.randomUUID().toString(), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100)));
        }

        students.stream().flatMapToInt(student -> IntStream.of(student.getKor(), student.getEng(), student.getMath()))
                .average().ifPresent(avg -> System.out.println("평균 : " + Math.round(avg * 10) / 10.0));

    }

}
