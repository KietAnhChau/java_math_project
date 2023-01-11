
import java.lang.reflect.Field;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;

public class testing {

    public static void main(String[] args) {
        // intStream1.forEach(System.out::println);
        // System.out.println(checking[checking.length - 1]);

        int number_range = 10;
        IntStream intStream1 = IntStream.range(2, number_range);
        int[] numbers = intStream1.toArray();
        List<Integer> lists = new ArrayList<Integer>();

        for (int number : numbers) {
            lists.add(number);
        }
        System.out.println("first: " + lists);

        for (int i = 0; i < lists.size() ; i++) {
            int number_test = lists.get(i) * lists.get(i);

            while (number_test <= lists.get((lists.size() -1))) {
                if (lists.contains(number_test)) {
                    lists.remove((Integer) number_test);
                }
                number_test += lists.get(i);
            }
        }
        System.out.println("last: " + lists);
    }
}
