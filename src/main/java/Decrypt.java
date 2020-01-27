public class Decrypt {

    public  static String decrpt (String cipher, int shftKey) {


        String newString = " ";
        for (int j  = 0; j < cipher.length(); j++) {
            if (Character.isLetter(cipher.charAt(j))) {
                if (Character.isLetter(cipher.charAt(j))) {
                    int letterPosition = Encode.letters.indexOf(cipher.charAt(j));
                    int key = (letterPosition - shftKey) % 52;

                    if (key < 0) {
                        key = Encode.letters.length() + key;
                    }
                    char changeVal = Encode.letters.charAt(key);
                    newString += changeVal;
                } else {
                    return newString;
                }
            }else {
                newString += cipher.charAt(j);

            }


        }
        return newString;
    }
}
