package working_with_stream;

import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 02/12/2023
 * <p>
 * Class: Q39
 */
public class Q39 {
    public static void main(String[] args) {
        var oceanAnimals = List.of("Shark", "Squid", "Whale", "Starfish", "Lobster");
        oceanAnimals.stream().parallel()
                .filter(s -> s.contains("e")).findFirst()
                .ifPresentOrElse(s -> System.out.println("FOUND " + s), () -> System.out.println("NOT FOUND!"));
    }
}
