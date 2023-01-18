import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Module1Function {
    /**
     * @param number_input Take a long and return its own prime number
     * @return A prime number list with ArrayList type
     */
    static List<Long> primeNumberFunction (long number_input) {
        LongStream longStream = LongStream.range(2, number_input);
        List<Long> lists = LongStream.of(longStream.toArray()).boxed().collect(Collectors.toCollection(ArrayList::new));

        for (int i = 0; i < lists.size() - 1 ; i++) {
            long number_test = lists.get(i) * 2;

            while (number_test <= lists.get((lists.size() -1))) {
                if (lists.contains(number_test)) {
                    lists.removeAll(List.of(number_test));
                }
                number_test += lists.get(i);
            }
        }
        return lists;
    }

    /**
     * @param prime_factorization_input Need to be double but can be int IDK im suck at code
     * @return A prime Factorization Number list with ArrayList type
     */
    static List<Long> primeFactorizationFunction (double prime_factorization_input){ // Need optimize
        List<Long> prime_number_lists = primeNumberFunction((int) prime_factorization_input);
        List<Long> prime_factorization_lists = new ArrayList<>();
        double prime_factorization_cal = prime_factorization_input;

        for (int i = 0; prime_factorization_cal > 1.0 ; i++ ) {
            prime_factorization_cal = prime_factorization_input / prime_number_lists.get(i);

            while (prime_factorization_cal % 1 == 0) {
                prime_factorization_lists.add(prime_number_lists.get(i));
                prime_factorization_input = prime_factorization_cal;
                prime_factorization_cal = prime_factorization_input / prime_number_lists.get(i);
            }
        }
        return prime_factorization_lists;
    }

    /**
     * @param replace_divisibility_input Need String with x along with number
     * @param divisible_input Need integer to divisible
     * @return A prime Factorization Number list with ArrayList type
     */
    static List<Integer> replaceDivisibilityFunction (String replace_divisibility_input, int divisible_input){
        List<Integer> return_holder = new ArrayList<Integer>();
        int[] replace_container_lists = {0,1,2,3,4,5,6,7,8,9};
        String string_test;

        for (int replace_container: replace_container_lists) {
            string_test = replace_divisibility_input.replace("x", Integer.toString(replace_container)) ;

            if (Double.parseDouble(string_test) / divisible_input % 1 == 0){
                return_holder.add(replace_container);
            }
        }

        return return_holder;
    }

    /**
     * @param number A normal number
     * @param power power of that number
     * @param mod mod of the number
     * @return A 2D list of number [[number, number^2, optimize number],[...]]
     */
    static ArrayList<ArrayList<Integer>> squareAndMultiplyFunction (int number, int power, int mod){
        long holder = number;
        ArrayList<ArrayList<Integer> > list_return = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, (int)holder, (int)holder)); list_return.add(list);

        for (int i = 2; i < power; i *= 2){
            if (!(Math.pow(number, i) < mod)) {
                long number_pow = (long)(Math.pow(holder, 2));
                holder = (long) (number_pow - (mod * Math.floor((double)number_pow / mod)));
                list = new ArrayList<>(Arrays.asList(i, (int)number_pow, (int)holder)); list_return.add(list);
            }else {
                list = new ArrayList<>(Arrays.asList(i, (int)Math.pow(number, i), (int)holder)); list_return.add(list);
            }
        }

        return list_return;
    }
}
