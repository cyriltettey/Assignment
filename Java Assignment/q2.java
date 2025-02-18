import java.util.Scanner;

public class OhmsLawCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose the unknown parameter (V for Voltage, I for Current, R for Resistance): ");
        char choice = scanner.next().toUpperCase().charAt(0);
        
        double voltage, current, resistance;
        
        switch (choice) {
            case 'V':
                System.out.print("Enter current (A): ");
                current = scanner.nextDouble();
                System.out.print("Enter resistance (Ω): ");
                resistance = scanner.nextDouble();
                voltage = current * resistance;
                System.out.println("Calculated Voltage: " + voltage + " V");
                break;
            
            case 'I':
                System.out.print("Enter voltage (V): ");
                voltage = scanner.nextDouble();
                System.out.print("Enter resistance (Ω): ");
                resistance = scanner.nextDouble();
                current = voltage / resistance;
                System.out.println("Calculated Current: " + current + " A");
                break;
            
            case 'R':
                System.out.print("Enter voltage (V): ");
                voltage = scanner.nextDouble();
                System.out.print("Enter current (A): ");
                current = scanner.nextDouble();
                resistance = voltage / current;
                System.out.println("Calculated Resistance: " + resistance + " Ω");
                break;
            
            default:
                System.out.println("Invalid choice! Please enter V, I, or R.");
        }
        
        scanner.close();
    }
}
