package function;

/*Function chaining
-----
andThen()
compose()
*/

import java.util.function.Function;

public class DemoFunc3 {
    public static void main(String[] args) {
        Function<Integer,Integer> f1= n-> n*2;
        Function<Integer,Integer> f2= n-> n*n*n;
        System.out.println(f1.andThen(f2).apply(2)); //first f1 is executed and then result goes to f2
        System.out.println(f1.compose(f2).apply(2)); //first f2 is executed and then result goes to f1

    }
}
