package tddlessons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsbnValidatorTest {

    @Test
    void validate_success() {
        assertTrue(IsbnValidator.validate("0716703440"));
        assertTrue(IsbnValidator.validate("9780716703440"));
        assertTrue(IsbnValidator.validate("9992158107"));
    }

    @Test
    void validate_xAsLastCharacter_success() {
        assertTrue(IsbnValidator.validate("012000030X"));
    }

    @Test
    void validate_codeIsNotCorrect() {
        assertFalse(IsbnValidator.validate("0716703441"));
        assertFalse(IsbnValidator.validate("9780716703449"));
    }

    @Test
    void validate_lengthIsNotCorrect() {
        assertFalse(IsbnValidator.validate("07167034401"));
        assertFalse(IsbnValidator.validate("071670344"));
    }

    @Test
    void validate_numberFormatException() {
        NumberFormatException exception = assertThrows(NumberFormatException.class, () -> IsbnValidator.validate("a716703441"));
        assertEquals(exception.getMessage(), "a is not a digit!");
    }
}