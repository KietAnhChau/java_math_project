import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Module1 {

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
        List<Long> prime_factorization_lists = new ArrayList<Long>();
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
        String greatest_common_factor_theory = "GCF is the product of all the factors common to both (or to all) numbers.  ";
        String least_common_multiple = "LCM is the smallest number that contains both (or all) numbers as factors.  ";

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

        // Determine all number is prime number (prime_number_input)
//        System.out.print("Enter the number you want to check prime (int): ");
//        long prime_number_input = scanner.nextLong();
//        List<Long> prime_number_cal = primeNumberFunction(prime_number_input);
//        System.out.println("The prime for number " + prime_number_input + " is " + prime_number_cal);

        // Determine the (prime_factorization_input)
//        System.out.print("Enter the number you want to determine the Prime Factorization (int): ");
//        int prime_factorization_input = scanner.nextInt();
//        System.out.println(primeFactorizationFunction(prime_factorization_input));


        // Determine if the first number is divisible by the second (divisibility_for_number_input)
//         System.out.print("Enter the number you want to determine if the first number is divisible by the second (int): ");
//         int divisibility_for_number_input = scanner.nextInt();

        // Determine all possible digit replacements for 'x' so that the first number is divisible by the second. (replace_divisibility_input)
//        System.out.print("Enter the number you want to find all possible digits replacements (ex: 764x88): ");
//        String replace_divisibility_input = scanner.nextLine();
//        System.out.print("Enter the number you want it to divisible (ex: 6): ");
//        int divisible_input = scanner.nextInt();
//        System.out.println(replace_divisibility_input + " by " + divisible_input + ", x ∈ "
//                + replaceDivisibilityFunction(replace_divisibility_input, divisible_input));

        // Determine Greatest Common Factor, GCF (greatest_common_factor_input)
//        System.out.print("Enter the list of number you want to determine Greatest Common Factor, GCF: ");
//        String testing = scanner.nextLine();
//        String[] currencies = testing.split(" ");
//        System.out.println(Arrays.toString(currencies));

        // Determine Square and Multiply Algorithm
        System.out.print("Please enter the numeber and the power (ex: 13^36 mod 73--> 13 36 73): ");
        String[] number_input_list = scanner.nextLine().split(" ");
        int number_input = Integer.parseInt(number_input_list[0]);
        int power = Integer.parseInt(number_input_list[1]);
        int mod = Integer.parseInt(number_input_list[2]);
        int sum = 1;

        StringBuilder binary_stringbuilder = new StringBuilder(Integer.toBinaryString(power));
        List<Integer> binary_list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> square_and_multiply = squareAndMultiplyFunction(number_input, power, mod);

        System.out.println("Decimal to Binary: " +power+ "₁₀ = " +binary_stringbuilder.reverse());

        for (int i = 0; i < binary_stringbuilder.length(); i++) {
            if (Character.toString(binary_stringbuilder.charAt(i)).equals("1")) binary_list.add((int)Math.pow(2, i));
        }
        for (ArrayList<Integer> integers : square_and_multiply) {
            System.out.println(number_input + "^" + integers.get(0) + " =\t" +
                    integers.get(1) + " =\t" + integers.get(2) + "\t(mod " + mod + ")");
        }
        for (ArrayList<Integer> integers : square_and_multiply) {
            for (Integer integer : binary_list) if (integers.get(0).equals(integer)) sum *= integers.get(2);
        }
        System.out.println("---- Ans: " +number_input+ "^"+ power+ " = "+sum+ "\t(mod " + mod + ") -----");

    }
}