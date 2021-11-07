public class StringParser {
    int inches, feet, totalInches;
    public StringParser(String input) {
        feet = Integer.parseInt(parse(input, '\''));
        inches = Integer.parseInt(parse(input, '\'' ,'"'));
        totalInches = feet*12+inches;
    }
    public int getTotalInches() {
        return totalInches;
    }
    static String parse(String string, char until) {
        return string.strip().substring(0, string.indexOf(until));
    }
    static String parse(String string, char from, char to) {
        return string.substring(string.indexOf(from)+1, string.indexOf(to));
    }
}
