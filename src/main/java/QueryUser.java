import java.io.InputStream;
import java.util.Locale;
import java.util.Scanner;

/**
 * The question asking class. It makes it easier to ask questions.
 * @author 24wilber
 * @version 11.9.2021
 */
class QueryUser {
    private Scanner in;
    public QueryUser(Scanner in) {this.in = in;}
    public QueryUser(InputStream inputStream) {this(new Scanner(inputStream));}
    public QueryUser() {this(System.in);}

    /**
     * ask the user for a string
     * @param Question The question to ask the user
     * @return the user's string response
     */
    public String QueryString(String Question) {
        System.out.print(Question);
        return in.nextLine();
    }

    /**
     * ask the user for an int
     * @param Question The question to ask the user
     * @return the user's int response
     */
    public int QueryInt(String Question) throws NumberFormatException {
        String UnparsedInt = this.QueryString(Question.strip());
        return Integer.parseInt(UnparsedInt);
    }

    public boolean QueryY_N(String Question) {
        // IntelliJ told me "'toLowerCase' call can be replaced with 'equalsIgnoreCase'"
        // while I was committing to the repo.
        return QueryString(Question).equalsIgnoreCase("y");
    }

    /**
     * close the scanner
     */
    public void Close() {
        in.close();
    }
}
