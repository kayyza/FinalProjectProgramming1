package util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

    @Test
    void toTitleCase() {
        String strIn = "comp sci";
        String expResult = "Comp Sci";
        String result = Util.toTitleCase(strIn);
        assertEquals(expResult, result);
    }
    @Test
    void toTitleCase2() {
        String strIn = "this is a string with multiple words";
        String expResult = "This Is A String With Multiple Words";
        String result = Util.toTitleCase(strIn);
        assertEquals(expResult, result);
    }
    @Test
    void toTitleCase3() {
        String strIn = "teSTinG";
        String expResult = "Testing";
        String result = Util.toTitleCase(strIn);
        assertEquals(expResult, result);
    }
    @Test
    void toTitleCase4() {
        String strIn = "tEsTiNG AgAIN";
        String expResult = "Testing Again";
        String result = Util.toTitleCase(strIn);
        assertEquals(expResult, result);
    }
}
