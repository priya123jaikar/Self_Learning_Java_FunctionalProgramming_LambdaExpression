package LambdaExpression;

@FunctionalInterface
interface  Cab
{
    public  void  bookCab();
}
//normal way to write


//class  Ola implements  Cab
//{
//    public  void  bookCab()
//    {
//        System.out.println("Ola cab is booked.....");
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        Ola cab =  new Ola();
//        cab.bookCab();
//
//    }
//}


//Using Lambda Expression(Lambda expression is only associated with the functional interface)


public class Test3 {
    public static void main(String[] args) {
        Cab cab = () -> System.out.println("Ola cab is booked.....");
        cab.bookCab();

    }
}

