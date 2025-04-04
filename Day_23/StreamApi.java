import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(19,2,3,5);

        Stream<Integer> data = nums.stream();



        // long count = data.count();
        // System.out.println(count);

        // Stream<Integer> sorted = data.sorted();
        // sorted.forEach(d-> System.out.println(d));

        // data.forEach(n-> System.out.println(n));

        Predicate<Integer> predi = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return (n % 2 == 1) ? true : false;
            }
        };

        System.out.println(predi.test(1));


        // Stream<Integer> mappedData = data.map(n->n*2);
        // mappedData.forEach(n->System.out.println(n));
        int result = data.reduce(0, (n,m)->n+m);
        System.out.println(result);


    }
    
}
