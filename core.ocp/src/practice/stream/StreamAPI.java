package practice.stream;

import practice.model.University;
import practice.model.User;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author thanhch
 * <p>
 * Date: 29/05/2024
 * <p>
 * Class: StreamAPI
 */
public class StreamAPI {
    static class Pair<K, V>{
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }
    public static void main(String[] args) {
        User user1 = new User(1, "thanhch", "huythanh@gmail.com", new University(1, "Dai hoc Ha Noi"));
        User user2 = new User(2, "huy", "huy@gmail.com", new University(2, "Dai hoc Bach Khoa"));
        User user3 = new User(3, "cat", "cat@gmail.com", new University(1, "Dai hoc Ha Noi"));
        User user4 = new User(4, "van", "van@gmail.com", new University(3, "Dai hoc Ngoai ngu"));
        User user5 = new User(5, "van", "van5@gmail.com", new University(3, "Dai hoc Ngoai ngu"));

        List<User> list = List.of(user1, user2, user3, user4, user5);
        Map<String, List<User>> mapUserGroupByUniversity = list.stream().collect(Collectors.groupingBy(user -> user.getUniversity().getName()));
        Map<Integer, List<String>> mapUserGroupByUniversityId = list.stream()
                .collect(Collectors.groupingBy(
                        user -> user.getUniversity().getId(),
                        Collectors.mapping(User::getUsername, Collectors.toList())
                ));
        Map<String, List<String>> mapUniversityNameUsername = list.stream().collect(Collectors.groupingBy(item -> item.getUniversity().getName(),
                Collectors.mapping(User::getUsername, Collectors.toList())));
        Map<String, List<Pair>> mapPair = list.stream()
                .collect(Collectors.groupingBy(
                        item -> item.getUniversity().getName(),
                        Collectors.mapping(
                                item -> new Pair(item.getId(), item.getUsername()),
                                Collectors.toList()
                        )
                ));
        System.out.println(mapUserGroupByUniversity);
        System.out.println(mapUserGroupByUniversityId);
        System.out.println(mapUniversityNameUsername);
        System.out.println(mapPair);

        List<String> strings = List.of("Stream", "API", "Java", "Code", "Practice");
        List<Integer> numbers = Arrays.asList(1, 9, 3, 4, 5, 6);
        List<String> names = Arrays.asList("Anna", "Bob", "Alexandra", "Zoe");
        int[] numbers2 = {3, 7, 2, 5, 6, 8, 4};
        int[] numbers3 = {2, 3, 4, 2, 3, 5, 4};
        List<String> strings2 = Arrays.asList("Java", "Python", "C++", "JavaScript");

        List<String> stringHasLengthGreaterThan3 = strings.stream().filter(s -> s.length() > 3)
                .collect(Collectors.toList());
        System.out.println(stringHasLengthGreaterThan3);

        IntSummaryStatistics statistic = numbers.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("SUM: " + statistic.getSum());
        System.out.println("MAX: " + statistic.getMax());
        System.out.println("AVERAGE: " + statistic.getAverage());

        List<Integer> listDouble = numbers.stream().map(x -> x * 2).collect(Collectors.toList());
        System.out.println(listDouble);

        String nameLengthShortest = names.stream().min(Comparator.comparing(String::length)).get();
        System.out.println(nameLengthShortest);
        List<String> nameListLengthShortest = names.stream().filter(s -> s.length() == nameLengthShortest.length()).collect(Collectors.toList());
        System.out.println(nameListLengthShortest);

        Map<String, Integer> mapNameLength = names.stream().collect(Collectors.toMap(Function.identity(), s -> s.length()));
        System.out.println(mapNameLength);

        List<Integer> listNumberGreaterThan5Asc = IntStream.of(numbers2).filter(x -> x > 5).boxed()
                .sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(listNumberGreaterThan5Asc);

        List<Integer> listNumberGreaterThan5Desc = IntStream.of(numbers2).filter(x -> x > 5).boxed()
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(listNumberGreaterThan5Desc);

        List<Integer> numberOccurenceOneTime = IntStream.of(numbers3).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet().stream().filter(s -> s.getValue() == 1)
                        .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(numberOccurenceOneTime);

        Map<Integer, Long> mapNumberOccurrences = Arrays.stream(numbers3).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(mapNumberOccurrences);
        List<Integer> numberOccurenceTwoTimes = mapNumberOccurrences.entrySet()
                .stream().filter(mapItem -> mapItem.getValue() == 2).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("List number occurrence 2 times: " + numberOccurenceTwoTimes);

        String stringJoiner = strings2.stream().collect(Collectors.joining(", "));
        System.out.println(stringJoiner);
    }
}
