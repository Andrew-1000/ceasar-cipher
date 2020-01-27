import java.io.Console;
import java.util.Scanner;

public class Encode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input String: ");
        String newString = scanner.nextLine();


        System.out.println("Please Provide Key:");
        int key = scanner.nextInt();

        String cipher = "";
        char letters;

        for (int x = 0; x < newString.length(); x++) {
            letters = newString.charAt(x);
        }



        System.out.println("Encrypted String:");


        System.out.println("Decrypted String");
    }
}
