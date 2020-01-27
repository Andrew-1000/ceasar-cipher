import java.io.Console;
import java.util.Scanner;

public class Encode {
    public static final String letters = "abcdefghijklmnopqrstuvwxyz";

    private char[] nStrng;

    public static String encrypt(String newString, int shiftKey){
        newString = newString.toLowerCase();
        String cipher = " ";


        for (int x = 0; x < newString.length(); x++) {
        if(Character.isLetter(newString.charAt(x))){
            if (Character.isLowerCase(newString.charAt(x))) {
                int letterPosition = letters.indexOf(newString.charAt(x));
                int key = (letterPosition + shiftKey) % 26;
                char changeValue = letters.charAt(key);
                cipher +=changeValue;
            } else  {
                return cipher;
            }}else{
                cipher += newString.charAt(x);
        }

        }
        return cipher;
    }

    public  static String decrpt (String decrypt, int shftKey) {

        decrypt = decrypt.toLowerCase();
        String deCipher = " ";
        for (int j  = 0; j < decrypt.length(); j++) {
            int letterPosition = letters.indexOf(decrypt.charAt(j));
            int key = (shftKey - letterPosition) % 26;
            char changeVal = letters.charAt(key);
            deCipher +=changeVal;

        }
        return deCipher;
    }

}
