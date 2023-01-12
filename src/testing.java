import java.util.*;
import java.util.List;
import java.util.stream.IntStream;

// THis code is just for testing before submit to the main one
public class testing {
    static List<Integer> primeNumber (int number_range) {
        IntStream intStream1 = IntStream.range(2, number_range + 1);
        List<Integer> lists = new ArrayList<Integer>();

        for (int number : intStream1.toArray()) {
            lists.add(number);
        }


        for (int i = 0; i < lists.size() ; i++) {
            int number_test = lists.get(i) * lists.get(i);

            while (number_test <= lists.get((lists.size() -1))) {
                if (lists.contains(number_test)) {
                    lists.remove((Integer) number_test);
                }
                number_test += lists.get(i);
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter the number you want to determine the prime factorization (int): ");
//        double prime_factorization_input = scanner.nextDouble();
        //System.out.print("Enter the number you want to find all possible digits replacements (string): ");
        //String replace_divisibility_for_number_cal = scanner.nextLine();

        String replace_divisibility_for_number_input = "9574886x"; // 764x88
        double divisible_input = 4; // 6

        List<Integer> holder = new ArrayList<Integer>();
        int[] replace_container_lists = {0,1,2,3,4,5,6,7,8,9};
        String test;

        for (int replace_container: replace_container_lists) {
            test = replace_divisibility_for_number_input.replace("x", Integer.toString(replace_container)) ;
            System.out.println(test);

            if (Double.parseDouble(test) / divisible_input % 1 == 0){
                holder.add(replace_container);
            }
        }
        System.out.println(holder);

    }
}
