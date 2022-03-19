import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomCharacterTest {
    static RandomCharacter randomChar;

    @BeforeAll
    public static void setUp(){
        randomChar = new RandomCharacter();
    }

    @Test
    void getRandomLowerCaseLetter() {
        char check = randomChar.getRandomLowerCaseLetter();
        assertTrue(Character.isLowerCase(check));
    }

    @Test
    void getRandomUpperCaseLetter() {
        char check = randomChar.getRandomUpperCaseLetter();
        assertTrue(Character.isUpperCase(check));
    }

    @Test
    void getRandomDigitCharacter() {
        char check = randomChar.getRandomDigitCharacter();
        assertTrue(Character.isDigit(check));
    }

    @Test
    void isRandomDigitCharacterPrime(){
        char check = randomChar.getRandomDigitCharacter();
        // Qn 2 part, checking if the generated value is a prime number;
        boolean flag = false;
        for (int i = 2; i <= check/2 ; ++i) {
            if (check % i == 0) {
                flag = true;
                break;
            }
        }
        assertFalse(flag);
    }

    @Test
    void getRandomCharacter() {
        char check = randomChar.getRandomCharacter();
    }
}