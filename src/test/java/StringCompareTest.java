import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCompareTest {
    String string;

    @Test
    public void Test1(){
        assertEquals(0, "ddd".compareTo("ddd"));
        assertEquals(-1, "a".compareTo("bb"));
        assertEquals(1, "t".compareTo("sdfd"));
    }
}
