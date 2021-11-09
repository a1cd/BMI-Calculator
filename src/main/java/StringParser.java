/**
 * String Parser
 * Turn a string of height (5'11") to total inches.
 * @author 24wilber
 * @version 11.9.2021
 */
public class StringParser {
    int inches, feet, totalInches;

    /**
     * @param input The given height
     */
    public StringParser(String input) {
        feet = Integer.parseInt(parse(input, '\''));
        inches = Integer.parseInt(parse(input, '\'' ,'"'));
        totalInches = feet*12+inches;
    }

    /**
     * @return The total inches from the given height
     */
    public int getTotalInches() {
        return totalInches;
    }

    /**
     * an easier way to extract values
     * @param string the input string
     * @param until the stopping value
     * @return the input string from the beginning up until the stopping value
     */
    static String parse(String string, char until) {
        return string.strip().substring(0, string.indexOf(until));
    }

    /**
     * an easier way to extract values
     * @param string the input string
     * @param from the starting value
     * @param to the stopping value
     * @return the input string from the starting value up until the stopping value
     */
    static String parse(String string, char from, char to) {
        return string.substring(string.indexOf(from)+1, string.indexOf(to));
    }
}
