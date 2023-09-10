package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrievingOperationTest {
    @Test
    void testLimit() {
        List.of("Dede", "Irwanto", "Dede", "Eka", "Potabuga", "Eka").stream()
                .limit(2)
                .forEach(System.out::println);
    }
    @Test
    void testSkip() {
        List.of("Dede", "Irwanto", "Dede", "Eka", "Potabuga", "Eka").stream()
                .skip(2)
                .forEach(System.out::println);
    }
    @Test
    void testTakeWhile() {
        List.of("Dede", "Edo", "Irwanto", "Dede", "Eka", "Potabuga", "Eka").stream()
                .takeWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }
    @Test
    void testDropWhile() {
        List.of("Dede", "Irwanto", "Dede", "Eka", "Potabuga", "Eka").stream()
                .dropWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }
    @Test
    void testFindyAny() {
        Optional<String> optional = List.of("Dede", "Irwanto", "Eka", "Potabuga", "Eka").stream()
                .findAny();
        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }
    @Test
    void testFindFirst() {
        Optional<String> optional = List.of("Dede", "Irwanto", "Dede", "Eka", "Potabuga", "Eka").stream()
                .findFirst();
        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }
}
