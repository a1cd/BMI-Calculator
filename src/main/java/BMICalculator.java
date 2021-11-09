import java.text.DecimalFormat;
import java.util.Dictionary;
import java.util.Scanner;

/**
 * BMI Calculator
 * A class that has methods to calculate your BMI from your height in inches and weight in pounds.
 * @author 24wilber
 * @version 11.9.2021
 */
public class BMICalculator {
    static DecimalFormat DF = new DecimalFormat("0.00");

    /**
     * A method to compute BMI from:
     * @param inches - The Height of the subject in inches
     * @param pounds - The Weight of the subject in LBS
     * @return the BMI of the subject
     */
    public static double computeBMI(int inches, int pounds) {
        if (inches<=0 || pounds<=0) return 0;
        double meters = 0.0254*inches;
        double kg = 0.454*pounds;
        return kg/Math.pow(meters, 2);

    }

    /**
     * The main method
     * @param args the useless garbage that you put into this program.
     *               it wont do anything, i dont use args ever in this
     *               method. I swear! -[edit] i lied, they act as
     *               height and weight replacements for testing
     */
    public static void main(String[] args) {
        QueryUser in = new QueryUser();
        do {

            // args are for testing
            String height = (args.length == 2) ? args[0] : in.QueryString("Enter your height in feet and inches (format 6'2\"): ");
            int weight = (args.length == 2) ? Integer.parseInt(args[1]) : in.QueryInt("Enter your weight in pounds: ");

            StringParser parser = new StringParser(height);
            System.out.println("Your BMI, expressed as weight(kg)/height(m)^2: " + DF.format(computeBMI(parser.getTotalInches(), weight)) + " kg/m^2");

        } while (args.length != 2 && in.QueryY_N("Do you want to calculate another? [y/n]: "));// args for testing
        in.Close();
    }
}