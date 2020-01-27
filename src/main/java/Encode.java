public class Encode {
    public static final String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String encrypt(String newString, int shftKey){

        String cipher = " ";
        for (int x = 0; x < newString.length(); x++) {
        if(Character.isLetter(newString.charAt(x))){
            if (Character.isLetter(newString.charAt(x))) {
                int letterPosition = letters.indexOf(newString.charAt(x));
                int key = (letterPosition + shftKey) % 52;
                char changeVal = letters.charAt(key);
                cipher +=changeVal;
            } else  {
                return cipher;
            }}else{
                cipher += newString.charAt(x);
        }

        }
        return cipher;
    }




}
