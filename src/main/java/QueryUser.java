import java.io.InputStream;
import java.util.Scanner;

class QueryUser {
    private Scanner in;
    public QueryUser(Scanner in) {this.in = in;}
    public QueryUser(InputStream inputStream) {this(new Scanner(inputStream));}
    public QueryUser() {this(System.in);}

    public String QueryString(String Question) {
        System.out.print(Question);
        return in.nextLine();
    }
    public int QueryInt(String Question) {
        String UnparsedInt = this.QueryString(Question.strip());
        return Integer.parseInt(UnparsedInt);
    }
}
