import java.io.Console;

public class CeasarCipher {

    private String mString;
    private int mKey;




    public CeasarCipher(String string, int key) {

        this.mString = string;
        this.mKey = key;

    }

    public String getString() {
        return mString;
    }
    public int getmKey() {
        return mKey;
    }
}
