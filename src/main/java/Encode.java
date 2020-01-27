import java.io.Console;
import java.util.Scanner;

public class Encode {
    public static final String letters = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String newString, int shiftKey){
        newString = newString.toLowerCase();
        String cipher = " ";
        for (int x = 0; x < newString.length(); x++) {
            int letterPosition = letters.indexOf(newString.charAt(x));
            int key = (letterPosition + shiftKey) % 26;
            char changeValue = letters.charAt(key);
            cipher +=changeValue;
        }
        return cipher;
    }

    public  static String decrpt (String decrypText, int shftKey) {

        decrypText = decrypText.toLowerCase();
        String cipherText = "";
        for (int j  = 0; j < decrypText.length(); j++) {
            int letterPosition = letters.indexOf(decrypText.charAt(j));
            int keyVal = (letterPosition - shftKey) % 26;

            if (keyVal <0) {
                keyVal = letters.length() + keyVal;
            }
            char changeVal = letters.charAt(keyVal);
            cipherText +=changeVal;
        }
        return cipherText;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input String:");
        String message = new String();
        message = scanner.next();

        System.out.println("Encrypted String: " + encrypt(message, 3));

        System.out.println("Decrypted String: " + decrpt(encrypt(message, 3), 3));
        scanner.close();

    }
}
