package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class AgregatComparatorTest {
    @Test
    void testMax() {
        List.of("Dede", "Irwanto", "Eka", "Wuryandari", "Potabuga").stream()
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testMin() {
        List.of("Dede", "Irwanto", "Eka", "Wuryandari", "Potabuga").stream()
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testCount() {
        Long count = List.of("Dede", "Irwanto", "Eka", "Wuryandari", "Potabuga").stream()
                .count();
        System.out.println(count);
    }

    @Test
    void testSum() {
        var result = List.of(1, 2, 3, 4, 5).stream()
                .reduce(0, (value, item) -> value + item);
        System.out.println(result);
    }

    @Test
    void testFactorial() {
        var factorial = List.of(1, 2, 3, 4, 5).stream()
                .reduce(1, (value, item) -> value * item);
        System.out.println(factorial);
    }
}
