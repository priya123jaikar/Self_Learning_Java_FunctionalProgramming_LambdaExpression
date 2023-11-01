package LambdaExpression;

interface  Cab2
{
    public  String bookCab(String source , String destination);
}

//Using normal method

//class  Ola2 implements  Cab2
//{
//    public String bookCab(String source , String destination)
//    {
//        System.out.println("Ola cab is booked from" + source + "To" + destination);
//        return ("Price: Rs 5000");
//    }
//}
//
//public class Test2 {
//    public static void main(String[] args) {
//        Cab2 cab2 =  new Ola2();
//        System.out.println(cab2.bookCab("Patna","Bengaluru"));
//
//    }
//}

//Using Lambda Expression

public class Test2 {
    public static void main(String[] args) {
        Cab2 cab2 =  (source , destination) ->{
            System.out.println("Ola cab is booked from" + source + "To" + destination);
            return ("Price: Rs 5000");
        };
        System.out.println(cab2.bookCab("Patna","Bengaluru"));

    }
}
