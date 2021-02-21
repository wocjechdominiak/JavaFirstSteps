package firstProject;
import java.util.Scanner;


public class AverageTemperature {
	public static void main (String...args) {
		double[] temperature = new double[7];
		Scanner inputScanner = new Scanner(System.in);
		
		for (int i=0;i<temperature.length;i++) {
			System.out.println("Wprowadz liczbe: " +i);
			temperature[i]=inputScanner.nextDouble();
		}
		
		double summarizedTemp = 0;
		for (double temp:temperature) {
			summarizedTemp+=temp;
		}
		System.out.println(summarizedTemp/temperature.length);
	}
}
