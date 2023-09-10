package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOpertionTest {
    @Test
    void testPeekBefore() {
        List.of("Dede", "Irwanto", "Eka", "Wuryandari", "Potabuga").stream()
                .map(name -> {
                    System.out.println("Before change name to upper : " + name);
                    String upper = name.toUpperCase();
                    System.out.println("Change name to upper : " + upper);
                    return upper;
                })
                .forEach(name -> System.out.println("Final name : " + name));
    }

    @Test
    void testPeekAfter() {
        List.of("Dede", "Irwanto", "Eka", "Wuryandari", "Potabuga").stream()
                .peek(name -> System.out.println("Before change name to upper " + name))
                .map(name -> name.toUpperCase())
                .peek(upper -> System.out.println("Change name to upper " + upper))
                .forEach(name -> System.out.println("Final name : " + name));
    }
}
