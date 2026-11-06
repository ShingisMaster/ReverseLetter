import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReverseLetterTests
{

    @Test
    void regularTest () {
        String letter = "J@va the be$t!123";
        String expected = "t@eb eht av$J!123";
        String actual = Main.revertLetter(letter);
        assertEquals(expected, actual);
    }

    @Test
    void emptyStringTest () {
        String letter = "";
        String expected = "";
        String actual = Main.revertLetter(letter);
        assertEquals(expected, actual);
    }

    @Test
    void singleLetterTest () {
        String letter = "a";
        String expected = "a";
        String actual = Main.revertLetter(letter);
        assertEquals(expected, actual);
    }

    @Test
    void onlyNumbersTest () {
        String letter = "#1234567@";
        String expected = "#1234567@";
        String actual = Main.revertLetter(letter);
        assertEquals(expected, actual);
    }

    @Test
    void onlyLettersTest () {
        String letter = "abcdefg";
        String expected = "gfedcba";
        String actual = Main.revertLetter(letter);
        assertEquals(expected, actual);
    }


    @Test
    void notLetterSymbolsInMixedPositionsTest () {
        String letter = "@ ab # cde $ fg *";
        String expected = "@ gf # edc $ ba *";
        String actual = Main.revertLetter(letter);
        assertEquals(expected, actual);
    }

    @Test
    void registerDependencyTest () {
        String letter = "@Ac00Ba%*";
        String expected = "@aB00cA%*";
        String actual = Main.revertLetter(letter);
        assertEquals(expected, actual);
    }

    @Test
    void nullStringTest () {
        String letter = null;
        assertThrows(
                IllegalArgumentException.class,
                () -> Main.revertLetter(letter)
        );
    }
}
