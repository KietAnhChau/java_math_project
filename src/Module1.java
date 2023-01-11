import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Module1 {

    /**
     * @param number_input Take an int and return its own prime number
     * @return A prime number list with ArrayList type
     */
    static List<Integer> primeNumberFunction (int number_input) {
        IntStream intStream = IntStream.range(2, number_input);
        List<Integer> lists = IntStream.of(intStream.toArray()).boxed().collect(Collectors.toCollection(ArrayList::new));

        for (int i = 0; i < lists.size() - 1 ; i++) {
            int number_test = lists.get(i) * 2;

            while (number_test <= lists.get((lists.size() -1))) {
                if (lists.contains(number_test)) {
                    //lists.remove(Integer.valueOf(number_test));
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
    static List<Integer> primeFactorizationFunction (double prime_factorization_input){ // Need optimize
        List<Integer> prime_number_lists = primeNumberFunction((int) prime_factorization_input);
        List<Integer> prime_factorization_lists = new ArrayList<Integer>();
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

    public static void main(String[] args) {
        // Module 1 - Number theory

        // Prepare
        Scanner scanner = new Scanner(System.in);

        // All theory in module 1
        String prime_number_theory = "A prime number is an integer greater than 1 whose only positive divisors are 1 and itself";
        String composite_number_theory = "A composite number is an integer greater than 1 that is not a prime. " +
                "It can be written as a product of integers greater than 1.";
        String the_fundamental_theorem_of_arithmetic = "Every integer greater than 1 is either prime or can be expressed as a" +
                " product of primes in a unique order in which the factors occur";
        String prime_factorization_theory = "Prime factorization of a number is a product of primes with the same value. ";

        // To Define and Apply Divisibility Tests
        String divisibility_rule_for_two = "All even numbers are divisible by 2 (the number n finishes at 0, 2, 4, ,6 8)";
        String divisibility_rule_for_three = "A number n, is divisible by 3 only if the sum of its digits is divisible by 3";
        String divisibility_rule_for_four = "A number n, is divisible by 4 only if the last two digits form a number divisible by 4";
        String divisibility_rule_for_five = "A number n, is divisible by 5 only if the number finishes at 0 or 5";
        String divisibility_rule_for_six = "If a number n, is divisible by 2 and 3 at the same time, it is divisible by 6";
        String divisibility_rule_for_seven = "For this rule we need to repeat the following step: \n" +
                "The last digit doubled and subtracted from the first part of the number n. " +
                "Repeat the step as necessary. If the last number is divisible by 7 than n is divisible by 7.";
        String divisibility_rule_for_eight = "A number n, is divisible by 8 if the last 3 digits form a number divisible by 8.";
        String divisibility_rule_for_nine = "A number n, is divisible by 9 only if the sum of its digits is divisible by 9";
        String divisibility_rule_for_ten = "A number n, is divisible by 10 only if the number finishes at 0";
        String divisibility_rule_for_eleven = "A number n, is divisible by 11 only if the alternating sum of its digits is divisible by 11";


        // Caculate thing

        // Determine all number is prime number (prim_number_cal)

        System.out.print("Enter the number you want to check prime (int): ");
        int prime_number_input = scanner.nextInt();
        List<Integer> prime_number_cal = primeNumberFunction(prime_number_input);
        System.out.println("The prime for number " + prime_number_input + " is " + prime_number_cal);

         // Determine the (prime_factorization_cal)
//        System.out.print("Enter the number you want to determine the Prime Factorization (int): ");
//        int prime_factorization_input = scanner.nextInt();
//        System.out.println(primeFactorizationFunction(prime_factorization_input));


//         Determine if the first number is divisible by the second (divisibility_for_number_cal)
//         System.out.print("Enter the number you want to determine if the first number is divisible by the second (int): ");
//         int divisibility_for_number_input = scanner.nextInt();
    }
}