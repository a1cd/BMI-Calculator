import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringParserTest {
    @Test
    void parse() {
        StringParser.parse("1'2\"", '\'');
    }

    @Test
    void getTotalInches() {
        StringParser parser = new StringParser("1'2\"");
        assertEquals(14, parser.getTotalInches());
    }

    @Test
    void testParseUntil() {
        assertEquals("abc", StringParser.parse("abcdef", 'd'));
        assertEquals("2", StringParser.parse("2'3\"", '\''));
    }

    @Test
    void testParseFromTo() {
        assertEquals("3", StringParser.parse("2'3\"", '\'', '"'));
        assertEquals("cde", StringParser.parse("abcdefg", 'b', 'f'));
    }
}