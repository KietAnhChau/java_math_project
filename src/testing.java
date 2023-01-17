import java.util.*;
import java.util.List;
import java.util.stream.IntStream;

// THis code is just for testing before submit to the main one
public class testing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter the number you want to determine the prime factorization (int): ");
//        double prime_factorization_input = scanner.nextDouble();
        //System.out.print("Enter the number you want to find all possible digits replacements (string): ");
        //String replace_divisibility_for_number_cal = scanner.nextLine();

        String numbers = "12 48 60";

        String[] number_list = numbers.split(" ");
        System.out.println(Arrays.toString(number_list));

        for (String number_string : number_list){
            double number = Double.parseDouble(number_string);
            
        }

    }
}
