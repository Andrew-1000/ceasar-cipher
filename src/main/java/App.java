import com.sun.tools.jdeprscan.scan.Scan;

import java.awt.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input String: ");

        String output = new String();
        output = scanner.next();

        System.out.println("Encrypted String: " + Encode.encrypt(output, 3));
        System.out.println("Decrypted String: " + Encode.decrpt(Encode.encrypt(output, 3), 3));

        scanner.close();
    }
}
