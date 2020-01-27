import java.io.Console;
import java.util.Scanner;

public class Encode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input String: ");
        String newString = scanner.nextLine();


        System.out.println("Please Provide Key:");
        int key = scanner.nextInt();

        String cipher = " ";
        char letters;

        for (int x = 0; x < newString.length(); x++) {

            //Shift one character
            letters = newString.charAt(x);

            if (letters >= 'a' && letters <= 'z') {
                //Shifting alphabet
                letters = (char) (letters + key);
                if (letters > 'z') {
                    letters = (char) (letters + 'a' - 'z' -1);

                } cipher = cipher + letters;

            }
            //For capital letters A - Z
            else if (letters >= 'A' && letters <= 'Z') {
                letters = (char) (letters +key);
                if (letters > 'Z') {
                    letters = (char) (letters+ 'A' - 'Z' -1);
                } cipher = cipher + letters;
            } else {
                cipher = cipher + letters;
            }
        }



        System.out.println("Encrypted String: " + cipher);

    }
}
