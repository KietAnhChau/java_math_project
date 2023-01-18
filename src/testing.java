import java.util.*;
import java.util.List;
import java.util.stream.IntStream;

// THis code is just for testing before submit to the main one
public class testing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the numeber and the power (ex: 13^36 mod 73--> 13 36 73): ");
        String[] number_input_list = scanner.nextLine().split(" ");
        int number_input = Integer.parseInt(number_input_list[0]);
        int power = Integer.parseInt(number_input_list[1]);
        int mod = Integer.parseInt(number_input_list[2]);

        long holder = number_input;
        ArrayList<ArrayList<Integer> > list_return = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, (int)holder, (int)holder)); list_return.add(list);

        for (int i = 2; i < power; i *= 2){
            if (!(Math.pow(number_input, i) < mod)) {
                long numer_pow = (long)(Math.pow(holder, 2));
                holder = (long) (numer_pow - (mod * Math.floor((double)numer_pow / mod)));
                list = new ArrayList<>(Arrays.asList(i, (int)numer_pow, (int)holder)); list_return.add(list);
            }else {
                list = new ArrayList<>(Arrays.asList(i, (int)Math.pow(number_input, i), (int)holder)); list_return.add(list);
            }
        }

        //System.out.println(number_input + "^" + i + " = " + numer_pow + " = " +holder+ "\t(mod "+mod+")");
        System.out.println(list_return.size());
        System.out.println(list_return);
    }
}
