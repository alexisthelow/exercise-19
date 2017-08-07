import java.util.Scanner;

public class BMICategories {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);		
		double ft, in, lbs, m, kg, bmi;
		
		System.out.print("Your height (feet only): ");
		ft = keyboard.nextDouble();
		
		System.out.print("Your height (inches only): ");
		in = (keyboard.nextDouble() + (ft * 12));
		
		System.out.print("Your weight in pounds: ");
		lbs = keyboard.nextDouble();
		
		m = (in * 0.0254);
		kg = (lbs * 0.4535);
		
		bmi = kg / (m*m);
		
		System.out.println("Your BMI is " + bmi + ".");	
		
		System.out.print("BMI category: ");
		if (bmi < 15) {
			System.out.println("very severely underweight");
		} else if (bmi <= 16) {
			System.out.println("severely underweight");
		} else if (bmi < 18.5) {
			System.out.println("underweight");
		} else if (bmi < 25) {
			System.out.println("normal weight");
		} else if (bmi < 30) {
			System.out.println("overweight");
		} else if (bmi < 35) {
			System.out.println("moderately obese");
		} else if (bmi < 40) {
			System.out.println("severely obese");
		} else {
			System.out.println("very severely/\"morbidly\" obese");
		}
	}
}