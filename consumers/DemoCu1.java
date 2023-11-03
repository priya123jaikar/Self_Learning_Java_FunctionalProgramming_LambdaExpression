package consumers;

import java.util.function.Consumer;

public class DemoCu1 {
    public static void main(String[] args) {
        Consumer<String> c = s -> System.out.println(s);
        c.accept("Welcome");
    }
}
