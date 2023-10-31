package functional_programing.stream_demo;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author thanhch
 * <p>
 * Date: 31/10/2023
 * <p>
 * Class: ExceptionCaseStudy
 */
public class ExceptionCaseStudy {
    List<String> createList() throws IOException {
        Stream<String> strStream = IntStream.range(1, 10).mapToObj(i -> "h" + i);
        return strStream.collect(Collectors.toList());
    }


    // Wrapper method and throw RuntimeException to handle case method throws check exception - good practice
    List<String> createSafeList() throws RuntimeException {
        try {
            return createList();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        List<Integer> integerList = IntStream.rangeClosed(1, 4).boxed().collect(Collectors.toList());
        integerList.stream().forEach(i -> System.out.println(new ExceptionCaseStudy().createSafeList()));
    }
}
