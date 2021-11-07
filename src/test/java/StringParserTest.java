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
    void testParse() {
    }

    @Test
    void testParse1() {
    }
}