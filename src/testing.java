import java.util.*;
import java.util.List;
import java.util.stream.IntStream;

// THis code is just for testing before submit to the main one
public class testing {
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
        Scanner scanner = new Scanner(System.in);

        int number_input = 13;
        int power = 36;
        int mod = 73;

        ArrayList<ArrayList<Integer>> square_and_multiply = squareAndMultiplyFunction(number_input, power, mod);
        StringBuilder binary_stringbuilder = new StringBuilder(Integer.toBinaryString(power));
        System.out.println("Decimal to Binary: " + power + "₁₀ = " + binary_stringbuilder.reverse());
        List<Integer> binary_list = new ArrayList<>();

        System.out.println(square_and_multiply);

        for (int i = 0; i < binary_stringbuilder.length(); i++) {
            if (Character.toString(binary_stringbuilder.charAt(i)).equals("1")) {
                System.out.println("try: " + i);
                binary_list.add((int)Math.pow(2, i));
            }
        }
        System.out.println(binary_list);

        int sum = 1;

        for (int i = 0; i < square_and_multiply.size(); i++){
            for (int n = 0; n < binary_list.size(); n++){
                if (square_and_multiply.get(i).get(0).equals(binary_list.get(n))) {

                    sum *= square_and_multiply.get(i).get(2);
                    System.out.println(square_and_multiply.get(i).get(0) + " and " +
                            square_and_multiply.get(i).get(2) + " and " +binary_list.get(n));
                    System.out.println(sum);
                }
            }
        }

    }
}
