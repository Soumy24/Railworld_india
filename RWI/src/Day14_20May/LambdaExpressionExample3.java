package Day14_20May;
//consumer interface to store a lambda expression in a variable
import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExpressionExample3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );
    }
}
