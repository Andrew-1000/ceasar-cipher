public class Decrypt {

    public  static String decrpt (String decrypt, int shftKey) {


        String deCipher = " ";
        for (int j  = 0; j < decrypt.length(); j++) {
            int letterPosition = Encode.letters.indexOf(decrypt.charAt(j));
            int key = (shftKey - letterPosition) % 26;
            char changeVal = Encode.letters.charAt(key);
            deCipher +=changeVal;

        }
        return deCipher;
    }
}
