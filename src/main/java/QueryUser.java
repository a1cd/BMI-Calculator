import java.io.InputStream;
import java.util.Scanner;

class QueryUser {
    private Scanner in;
    public QueryUser(Scanner in) {this.in = in;}
    public QueryUser(InputStream inputStream) {this(new Scanner(inputStream));}
    public QueryUser() {this(System.in);}

    public String askQuestion(String Question) {
        System.out.print(Question);
        return in.nextLine();
    }

}
