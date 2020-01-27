import java.io.Console;
import java.util.Scanner;

public class Encode {
    public static final String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private char[] nStrng;

    public static String encrypt(String newString, int shiftKey){

        String cipher = " ";
        for (int x = 0; x < newString.length(); x++) {
        if(Character.isLetter(newString.charAt(x))){
            if (Character.isLetter(newString.charAt(x))) {
                int letterPosition = letters.indexOf(newString.charAt(x));
                int key = (letterPosition + shiftKey) % 52;
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



}
