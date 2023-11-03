package consumers;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class  Employee
{
    String ename;
    int salary;
    String gender;
    Employee(String ename, int salary , String gender)
    {
        this.ename= ename;
        this.salary= salary;
        this.gender=gender;
    }
}

public class DemoCu2 {
    public static void main(String[] args) {
        ArrayList<Employee> emplist = new ArrayList<Employee>();
        emplist.add(new Employee("David" , 50000, "Male"));
        emplist.add(new Employee("John" , 30000, "Male"));
        emplist.add(new Employee("Mary" , 20000, "FeMale"));
        emplist.add(new Employee("Scott" , 60000, "Male"));

        //Function
        Function<Employee,Integer> f = emp -> (emp.salary*10)/100;

        //Predicate
        Predicate<Integer> p = b -> b>=5000;

        //Consumer(it is not returning anything it just consume the data whatever we passed and just returned those data)
        Consumer<Employee> c = emp -> {
            System.out.println(emp.ename);
            System.out.println(emp.salary);
            System.out.println(emp.gender);
        };

        for (Employee e : emplist)
        {
            int bonus =f.apply(e); // calculate the bonus // invoked function
            if(p.test(bonus)) // invoked predicate
            {
                c.accept(e); // inoked consumer
                System.out.println("Enployee Bonus:" +  bonus);
            }
        }

    }
}
