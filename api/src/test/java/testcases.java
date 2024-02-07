import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;


class JUnit5TestCases {
 
    @DisplayName("Single test successful")
    @Test
    void testSingleSuccessTest() {
        System.out.println("Successful use case 1");
        assertEquals(1,1);
    }

    @DisplayName("Single word successful")
    @Test
    void testWordSuccessTest() {
        System.out.println("Successful use case 1");
    }
}