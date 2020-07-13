import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaStrategyPatternExample {

    public static int sum(List<Integer> numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }
    public static int sumOdd(List<Integer> numbers) {
        int sum = 0;
        for (int n : numbers) {
            if(n%2!=0)
            sum += n;
        }
        return sum;
    }
    public static int sumEvenThough(List<Integer> numbers) {
        int sum = 0;
        for (int n : numbers) {
            if(n%2==0)
                sum += n;
        }
        return sum;
    }

    public static int sumWithLambdaStyle(List<Integer> numbers, Predicate<Integer> filter) {
        return numbers.stream().filter(filter).mapToInt(i -> i ).sum();
    }

    public static void main(String[] args) {
        System.out.println(sum(Arrays.asList(1,2,3,4,4,5,5)));
        System.out.println(sumEvenThough(Arrays.asList(1,2,3,4,4,5,5)));
        System.out.println(sumOdd(Arrays.asList(1,2,3,4,4,5,5)));

        // Strategy with predicate given the option to execute
        System.out.println(sumWithLambdaStyle(Arrays.asList(1,2,3,4,4,5,5),e-> true));
        System.out.println(sumWithLambdaStyle(Arrays.asList(1,2,3,4,4,5,5),e->e%2==0));
        System.out.println(sumWithLambdaStyle(Arrays.asList(1,2,3,4,4,5,5),e->e%2!=0));
    }

}
