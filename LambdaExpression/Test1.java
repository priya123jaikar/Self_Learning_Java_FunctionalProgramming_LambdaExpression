package LambdaExpression;


@FunctionalInterface
interface  Cab1
{
    public void  bookCab1(String source , String destination);
}

//Using normal method


//class  Ola1 implements  Predicate.Cab1
//{
//    public  void  bookCab1(String source , String destination)
//    {
//        System.out.println("Ola cab is booked from " + source + " To "+ destination);
//    }
//}
//
//public class Predicate.Test1 {
//    public static void main(String[] args) {
//        Predicate.Cab1 cab1 = new Ola1();
//        cab1.bookCab1("Bengaluru","Patna");
//
//    }
//}


//Using Lambda Expression

public class Test1 {
    public static void main(String[] args) {
        Cab1 cab1 = (source , destination)->System.out.println("Ola cab is booked from " + source + " To "+ destination);
        cab1.bookCab1("Bengaluru","Patna");

    }
}

