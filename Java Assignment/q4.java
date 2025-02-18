import java.util.Scanner;

public class MotorSpeedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the input voltage (V): ");
        double voltage = scanner.nextDouble();
        
        System.out.print("Enter the back EMF (V): ");
        double backEMF = scanner.nextDouble();
        
        System.out.print("Enter the motor constant (K): ");
        double motorConstant = scanner.nextDouble();
        
        // Validate inputs to prevent division by zero or negative values
        if (voltage <= 0 || backEMF < 0 || motorConstant <= 0) {
            System.out.println("Invalid input values. Ensure that voltage and motor constant are positive, and back EMF is non-negative.");
        } else {
            // Formula to calculate motor speed (in RPM)
            double speed = (voltage - backEMF) / motorConstant;
            System.out.printf("The calculated speed of the DC motor is: %.2f RPM%n", speed);
        }
        
        scanner.close();
    }
}
