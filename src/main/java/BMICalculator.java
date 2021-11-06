import java.util.Scanner;

public class BMICalculator {
    public static double computeBMI(int inches, int pounds) {
        double meters = 0.0254*inches;
        double kg = 0.454*pounds;
        return kg/Math.pow(meters, 2);
    }

    public static void main(String[] args) {
        QueryUser in = new QueryUser();
        String height = in.askQuestion("Enter your height in feet and inches (format 6'2\"): ");
        String weight = in.askQuestion("Enter your weight in pounds: ");
        System.out.println(height);
        System.out.println(weight);
    }
}