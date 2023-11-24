import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(11,22,33,54,67);
        Stream<Integer> data = nums.stream ();
        data.forEach(i -> {
            System.out.println(i);
        });
        
    }
}