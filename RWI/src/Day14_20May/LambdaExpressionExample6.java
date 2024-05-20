//Using Comparator
package Day14_20May;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Person{
    int age;
    String name;

    public Person(int age, String name) {
        super();
        this.age = age;
        this.name = name;

    }
}
public class LambdaExpressionExample6{
    public static void main(String[] args)
    {

        List<Person> list = new ArrayList<Person>();

        //Adding person details to list
        list.add(new Person(21,"John"));
        list.add(new Person(13,"Ram"));
        list.add(new Person(2,"Dikshita"));

        System.out.println("Sorting on the basis of the name of the person...");

        // implementing lambda expression

        Collections.sort(list,(p1,p2)->{
            return p1.name.compareTo(p2.name);
        });

        // printing sorted list
        for(Person p:list){
            System.out.println( p.name+" "+p.age);
        }

    }
}
