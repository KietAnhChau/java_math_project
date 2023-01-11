import java.util.*;
import java.util.List;
import java.util.stream.IntStream;

// THis code is just for testing before submit to the main one
public class testing {
    static List<Integer> primeNumber (int number_range) {
        IntStream intStream1 = IntStream.range(2, number_range);
        int[] numbers = intStream1.toArray();

        List<Integer> lists = new ArrayList<Integer>();
        for (int number : numbers) {
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

        double prime_factorization_input = 28050;

        List<Integer> prime_number_lists = primeNumber((int) prime_factorization_input);
        List<Integer> prime_factorization_lists = new ArrayList<Integer>();

        double prime_factorization_cal = prime_factorization_input;

        for (int i = 0; prime_factorization_cal > 1.0 ; i++ ) {
            prime_factorization_cal = prime_factorization_input / prime_number_lists.get(i);

            while (prime_factorization_cal % 1 == 0) {
                System.out.println(prime_factorization_cal + " the other is " + prime_number_lists.get(i));
                prime_factorization_lists.add(prime_number_lists.get(i));

                prime_factorization_input = prime_factorization_cal;
                prime_factorization_cal = prime_factorization_input / prime_number_lists.get(i);
            }
        }
        System.out.println(prime_factorization_lists);
    }
}
