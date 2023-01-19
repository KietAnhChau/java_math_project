import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;

// THis code is just for testing before submit to the main one
public class testing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Check Air Line digit
        String  ticket_number = "8669064259x";
        BigDecimal number_holder = BigDecimal.valueOf(Long.parseLong(ticket_number.replace("x", "")) / 7.0);
        BigDecimal check_number = number_holder.subtract(number_holder.setScale(0, RoundingMode.DOWN)).multiply(BigDecimal.valueOf(7));
        System.out.println("The check number x is " +check_number.toBigInteger()+ " and ANS = "
                +ticket_number.replace("x", check_number.toBigInteger().toString()));


        // check SIN digit - 9 digits
        String SIN_number = "54749980x".replace("x",""); // "54749980x"
        int SIN_sum = 0;
        for (int i = 0; i < SIN_number.length(); i++){
            int holder = Integer.parseInt(Character.toString(SIN_number.charAt(i)));
            if (!(i % 2 == 0)) {
                if (holder * 2 > 10) SIN_sum += ((holder * 2) % 10 ) + 1; else SIN_sum += holder * 2;
            }else SIN_sum += holder;
        }
        int SIN_check_digit = SIN_sum - (10 * ((SIN_sum / 10))) ;
        System.out.println("-"+SIN_sum+ " = x\t(mod 10);\t x = "+SIN_check_digit);

        // check UPC digit
        String UPC_number = "84945643857x".replace("x","");
        int UPC_sum = 0;
        for (int i = 0; i < UPC_number.length(); i++){
            int holder = Integer.parseInt(Character.toString(UPC_number.charAt(i)));
            if (i % 2 == 0) UPC_sum += holder * 3; else UPC_sum += holder;
        }
        int UPC_check_digit = UPC_sum - (10 * ((UPC_sum / 10))) ;
        System.out.println("-"+UPC_sum+ " = x\t(mod 10);\t x = "+UPC_check_digit);

        // check ISBN  digit, 10 digit

        String ISBN_number = "a" + "316559197x".replace("x",""); //316559197
        int ISBN_sum = 0;
        for (int i = 1; i < ISBN_number.length(); i++){
            int holder = Integer.parseInt(Character.toString(ISBN_number.charAt(i)));
            ISBN_sum += holder * i;
        }
        int ISBN_check_digit = ISBN_sum - (11 * ((ISBN_sum / 11)));
        System.out.println(ISBN_sum+ " = x\t(mod 11);\t x = "+ISBN_check_digit);

    }
}
