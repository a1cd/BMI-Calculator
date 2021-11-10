import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.List;

public class BMICalculatorTester {
	private static final DecimalFormat df = new DecimalFormat("0.00");
	@Test
	@DisplayName("test psvm")
	public void testMain() {
		String[] args = {"5'1\"", "110"};
		BMICalculator.main(args);
	}
	@Test
	@DisplayName("test all tests")
	public void testComputeBMI() {
		testInvalidHeightComputeBMI();
		testInvalidWeightComputeBMI();
		testValidComputeBMI();
		testInvalidWeightAndHeightComputeBMI();
	}
	@Test
	@DisplayName("invalid height values")
	public void testInvalidHeightComputeBMI() {
		// three invalid height values
		assertEquals("0.00", df.format(BMICalculator.computeBMI(-12, 175)));
		assertEquals("0.00", df.format(BMICalculator.computeBMI(0, 134)));
		assertEquals("0.00", df.format(BMICalculator.computeBMI(-345671, 245)));
	}
	@Test
	@DisplayName("valid inputs")
	public void testValidComputeBMI() {
		// eight valid tests
		assertEquals("24.43", df.format(BMICalculator.computeBMI(71, 175)));
		assertEquals("25.75", df.format(BMICalculator.computeBMI(73, 195)));
		assertEquals("23.19", df.format(BMICalculator.computeBMI(64, 135)));
		assertEquals("30.44", df.format(BMICalculator.computeBMI(68, 200)));
		assertEquals("31.59", df.format(BMICalculator.computeBMI(70, 220)));
		assertEquals("18.15", df.format(BMICalculator.computeBMI(71, 130)));
		assertEquals("24.66", df.format(BMICalculator.computeBMI(59, 122)));
		assertEquals("21.28", df.format(BMICalculator.computeBMI(69, 144)));
	}
	@Test
	@DisplayName("invalid height and weight values")
	public void testInvalidWeightAndHeightComputeBMI() {
		// two invalid height and weight values
		assertEquals("0.00", df.format(BMICalculator.computeBMI(0, 0)));
		assertEquals("0.00", df.format(BMICalculator.computeBMI(-1, -1)));
	}
	@Test
	@DisplayName("invalid weight values")
	public void testInvalidWeightComputeBMI() {
		// three invalid weight values
		assertEquals("0.00", df.format(BMICalculator.computeBMI(70, 0)));
		assertEquals("0.00", df.format(BMICalculator.computeBMI(64, -20)));
		assertEquals("0.00", df.format(BMICalculator.computeBMI(59, -3245)));
	}
}