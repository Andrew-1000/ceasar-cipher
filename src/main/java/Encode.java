public class Encode {

    public static String encrypt(String newString, int shftKey){

        String cipher = "";
        for (int x = 0; x < newString.length(); x++) {
        if(Character.isLetter(newString.charAt(x))){
            if (Character.isLetter(newString.charAt(x))) {
                //getting the index of letter
                int letterPosition = App.letters.indexOf(newString.charAt(x));


                int key = (letterPosition + shftKey) % 52;


                char changeVal = App.letters.charAt(key);
                cipher += changeVal;
            } else {
                return cipher;
            }
        }     else {
                cipher += newString.charAt(x);
            }

        }
        return cipher;
    }




}
