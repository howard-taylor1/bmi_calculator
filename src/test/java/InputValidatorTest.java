import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {

    @org.junit.jupiter.api.Test
    void textIsNotValid() {
        assertFalse(InputValidator.isValidNumber("random+text$", 1, 100));
    }
    @org.junit.jupiter.api.Test
    void numberOutOfRangeIsNotValid() {
        assertFalse(InputValidator.isValidNumber("100.1", 1, 100));
    }
    @org.junit.jupiter.api.Test
    void negativeNumberIsNotValid() {
        assertFalse(InputValidator.isValidNumber("-0.2", 1, 100));
    }
    @org.junit.jupiter.api.Test
    void formatIsNotValid() {
        assertFalse(InputValidator.isValidNumber("100.", 1, 100));
    }
    @org.junit.jupiter.api.Test
    void edgeIsValid() {
        assertTrue(InputValidator.isValidNumber("100", 1, 100));
    }
}