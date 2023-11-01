package Predicate;

import java.util.function.Predicate;

//Predicate ----> one parameter , returns boolean
//use only if you have conditional checks in your program

public class Demo1 {
    public static void main(String[] args) {
        //Example1: check whether the given number is greater than 10 or not

        Predicate<Integer> p=i->(i>10);//p is a reference variable and i is an argument
        System.out.println(p.test(20));
        System.out.println(p.test(7));

        //Example2: check the length of given string is grater than 4 or not.

        Predicate<String> pr = s ->(s.length()>4);
        System.out.println(pr.test("welcome"));
        System.out.println(pr.test("xyz"));


        //Example3:Print array elements whose size is greater than 4 in array

        String names[] = {"David","Scott","Smith","John","Mary"};
        Predicate<String> nm = n->(n.length()>4);
        for(String name:names)
        {
            if(nm.test(name))
            {
                System.out.println(name);
            }
        }

    }
}
