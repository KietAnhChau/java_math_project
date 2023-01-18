import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Module1 {

    public static void main(String[] args) {
        // Module 1 - Number theory

        // Prepare
        Scanner scanner = new Scanner(System.in);

        // Calculate thing

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
        ArrayList<ArrayList<Integer>> square_and_multiply = Module1Function.squareAndMultiplyFunction(number_input, power, mod);

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

        // Airline, SIN, UPC, ISBN checker



    }
}