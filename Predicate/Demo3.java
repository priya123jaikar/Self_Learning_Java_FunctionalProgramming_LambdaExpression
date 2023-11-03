package Predicate;

import java.util.function.Predicate;

public class Demo3 {
    public static void main(String[] args) {
        int a[] = {5,15,20,25,30,35,40,45,50,55,60,65};
        Predicate<Integer> p1 = i ->i%2==0;
        Predicate<Integer> p2 = i -> i>50;

        System.out.println("Following are numbers which are Even and Greater than 50 --->");

        //and
        for(int n:a){
            if(p1.and(p2).test(n))
            {
                System.out.println(n);
            }
        }


        //or
        System.out.println("Following are numbers which are Even or Greater than 50 --->");
        for(int n:a){
            if(p1.or(p2).test(n))
            {
                System.out.println(n);
            }
        }

        //negate
        System.out.println("Following are numbers which are odd --->");
        for(int n:a){
            if(p1.negate().test(n))
            {
                System.out.println(n);
            }
        }


    }
}
