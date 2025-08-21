/**
 * This BMI Calculator functions to take the users information and determine their BMI category.
 *
 * @author Paris Proffitt
 * @version September 27th, 2024
 */
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //User input
        System.out.print("Enter your name (first last): ");
        String firstName = scanner.next();
        String lastName = scanner.next();

        System.out.print("Enter your weight in pounds (e.g. 175): ");
        double weightPounds = scanner.nextDouble();

        System.out.print("Enter your height in feet and inches (e.g. 5 11): ");
        int feet = scanner.nextInt();
        int inches = scanner.nextInt();

        //Conversions
        double heightMeters = (feet * 12 + inches) * 0.0254;
        double weightKg = weightPounds * 0.453592;
        
        //Rounding
        heightMeters = (int)(heightMeters * 10 + 0.5) / 10.0;
        weightKg = (int)(weightKg * 10 + 0.5) / 10.0;
        
        //BMI Calculation
        double bmi = weightKg / (heightMeters * heightMeters);
        int roundedBMI = (int)(bmi + 0.5);

        //BMI
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 25) {
            category = "Normal or Healthy Weight";
        } else if (bmi < 30) {
            category = "Overweight";
        } else {
            category = "Obese";
        }
        
        System.out.println();
        System.out.println("Body Mass Index Calculator");
        System.out.println("=====================================");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Height (m): " + heightMeters);
        System.out.println("Weight (kg): " + weightKg);
        System.out.println("BMI: " + roundedBMI);
        System.out.println("Category: " + category);

        scanner.close();
    }
}
