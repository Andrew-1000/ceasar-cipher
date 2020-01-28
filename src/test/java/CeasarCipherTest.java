import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Test;

import static org.junit.Assert.*;

public class CeasarCipherTest {

    @Test

    public void ceasarCipher_userInputIsString_true() {

        String isString = new String();
        assertEquals(true, isString instanceof String);

    }


    @Test
    public void encrypt_confirmsEncryptionWorks_encryptedText() {
        Encode iStrng = new Encode();
        assertEquals("i", iStrng.encrypt("h", 1) );
    }

    @Test

    public void decrypt_confirms_DecryptionWorks_decrytpedtText() {
        Decrypt iString = new Decrypt();
        assertEquals("h",iString.decrpt("i", 1));
    }
}
