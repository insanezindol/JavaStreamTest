import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamTest {

    public static void main(String[] args) {

        System.out.println("case1. Person Stream");
        // generate test data
        List<Person> personList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            personList.add(new Person(UUID.randomUUID().toString(), rand.nextInt(100), rand.nextInt(100) + 100));
        }

        for (Person person : personList) {
            System.out.println("[original] person : " + person.getName() + ", " + person.getAge() + ", " + person.getHeight());
        }

        // 병렬 스트림 생성
        Stream<Person> parallelStream = personList.parallelStream();

        // 병렬 여부 확인
        boolean isParallel = parallelStream.isParallel();
        System.out.println("isParallel : " + isParallel);

        boolean isMany = parallelStream.map(person -> person.getAge() * 10).anyMatch(age -> age > 300);
        System.out.println("isMany : " + isMany);


        System.out.println("case2. IntStream");
        IntStream intStream1 = IntStream.range(1, 150);
        intStream1.parallel(); // parallel 모드
        System.out.println("isParallel : " + intStream1.isParallel());
        intStream1.sequential(); // sequential 모드
        System.out.println("isParallel : " + intStream1.isParallel());

    }

}
