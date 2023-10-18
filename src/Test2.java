import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("X", "H", "A", "C", "B", "F");
        list.parallelStream().sorted(Comparator.reverseOrder()).forEach(System.out::print); // CBFAXH
    }
}