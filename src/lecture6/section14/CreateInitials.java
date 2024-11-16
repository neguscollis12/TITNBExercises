package lecture6.section14;

import java.util.Locale;
import java.util.Scanner;

public class CreateInitials {

    public static void main(String[] args) {
        String firstName = "Negus";
        String lastName = "Collis";
        System.out.println(createInitials(firstName , lastName));


    }

    public static String createInitials(String firstName, String lastName){

        return "" + firstName.charAt(0) + lastName.charAt(0);
    }
}
