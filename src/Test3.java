import java.util.Arrays;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        final Object[] array = new Random().ints(100, 1, 5)
                .mapToObj(String::valueOf).parallel().sorted().toArray();
        System.out.println(Arrays.toString(array));
    }
}