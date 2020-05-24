package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAssertion {
    @Test
    void assertion(){
        assertAll("demo assertion",
                () -> {assertEquals(1,1);},
                () -> assertEquals(1,1),
                () -> assertEquals(1,1));
        System.out.println("XXX");
        assertAll("demo assertions",
                () -> assertEquals(2,2),
                () -> assertEquals(1,1),
                () -> assertEquals(4,4)
        );
    }
}


