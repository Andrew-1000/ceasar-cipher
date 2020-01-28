
import java.util.Scanner;

public class App {
    public static final String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input String: ");

        String userInput = "";
        userInput = scanner.nextLine();

        System.out.println("Enter Key: ");
        String key = scanner.nextLine();

        int shKey = Integer.parseInt(key);

        System.out.println("Input String: " + userInput);
        System.out.println("Encrypted String: " + Encode.encrypt(userInput, shKey));
        System.out.println("Decrypted String: " + Decrypt.decrpt(Encode.encrypt(userInput, shKey), shKey));

        scanner.close();
    }
}
