import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    // test input to be string
    @Test
    public void  testEncoding_testWord_String(){
        Encode testEncode = new Encode();
        assertEquals(true , testEncode instanceof Encode);
    }

    @Test
    public void decodeTest_testWord_String(){

        Decode decodeTest = new Decode();
        assertEquals(true, decodeTest instanceof Decode);
    }
}