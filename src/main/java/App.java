
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input String: ");

        String output = "";
        output = scanner.nextLine();

        System.out.println("Enter Key: ");
        String key = scanner.nextLine();

        int shKey = Integer.parseInt(key);

        System.out.println("Input String: " + output);
        System.out.println("Encrypted String: " + Encode.encrypt(output, shKey));
        System.out.println("Decrypted String: " + Decrypt.decrpt(Encode.encrypt(output, shKey), shKey));

        scanner.close();
    }
}
