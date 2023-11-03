package function;

import java.util.function.Function;

public class DemoFunc1 {
    public static void main(String[] args) {
        Function<Integer,Integer> f = n->n*n; //f is a reference  and n is an argument
        System.out.println(f.apply(5));
        System.out.println(f.apply(25));
        System.out.println(f.apply(90));

        // String Length

        Function<String,Integer> fn = s -> s.length();
        System.out.println(fn.apply("Welcome"));
        System.out.println(fn.apply("Java"));
        System.out.println(fn.apply("SpringBoot"));
    }
}
