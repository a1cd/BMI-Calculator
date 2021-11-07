import java.text.DecimalFormat;
import java.util.Scanner;

public class BMICalculator {
    static DecimalFormat DF = new DecimalFormat("0.00");

    public static double computeBMI(int inches, int pounds) {
        if (inches<=0 || pounds<=0) return 0;
        double meters = 0.0254*inches;
        double kg = 0.454*pounds;
        return kg/Math.pow(meters, 2);
    }

    public static void main(String[] args) {
        QueryUser in = new QueryUser();
        String height = in.QueryString("Enter your height in feet and inches (format 6'2\"): ");
        int weight = in.QueryInt("Enter your weight in pounds: ");
        StringParser parser = new StringParser(height);
        System.out.println("Your BMI, expressed as weight(kg)/height(m)^2: " + DF.format(computeBMI(parser.getTotalInches(), weight)) + " kg/m^2");
    }
}