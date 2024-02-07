import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
 
class JUnit5TestCases {
 
    @DisplayName("Single test successful")
    @Test
    void testSingleSuccessTest() {
        System.out.println("Successful use case 1");
    }

    @DisplayName("Single test successful")
    @Test
    void testWordGeneratorTest() {
        System.out.println("Random");
    }
}