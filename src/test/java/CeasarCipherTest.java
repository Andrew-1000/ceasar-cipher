import org.junit.Test;

import static org.junit.Assert.*;

public class CeasarCipherTest {

    @Test

    public void ceasarCipher_userInputIsString_true() {

        String isString = ("^[a-zA-Z]*$");
        assertEquals(true, isString );


        //Checks whether userInput is string
        //Used Regular Expression
//        return ((string != null)
//                && (!string.equals(""))
//                && (string.matches("^[a-zA-Z]*$")));

    }
}
