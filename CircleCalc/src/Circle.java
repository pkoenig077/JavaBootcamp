import java.math.RoundingMode;
import java.text.DecimalFormat;
/**
 * 
 * @author Phil
 * @Class for finding area, circumference, circle count, and formatting area and circumference values to 2 decimal places
 */
public class Circle {
	private double Radius;
	public static int Counter;
/**
 * 
 * @param radius
 */
	public Circle(double radius) {
		Radius = radius;
		Counter++;

	}
/**
 * method to get circumference
 * @return
 * double value for circumference
 */
	public double getCircumference() {
		return 2 * (Math.PI) * Radius;

	}
/**
 * method to get Area of a circle
 * @return
 *  double value for area
 */
	public double getArea() {
		 return (Math.PI) * Radius * Radius;
	}
/**
 * 
 * @param x 
 * @return formatted String of double value to 2 decimal places
 */
	private String formatNumber(double x) {

		DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.HALF_UP);
		

		return df.format(x);
	}

	/**
	 * method to get formatted circumference to 2 decimal places
	 * @return string 
	 */
	public String getFormattedCircumference() {
		String FormatCircumference = formatNumber(getCircumference());
		return FormatCircumference;
	}
/**
 * method to get formatted area to 2 decimal places
 * @return string 
 */
	public String getFormattedArea() {
		return formatNumber(getArea());
	}
	
	/**
	 * 
	 * @return int number of Circle objects created
	 */
	public static int getCounter(){
		return Counter;
	}
	
}
