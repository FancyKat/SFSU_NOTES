import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Get the unit system choice from the user
        String unitSystem = getUnitSystemChoice();

        // Welcome message
        welcomeMessage();

        // Placeholder for user input
        UserInput input = handleUserInput(unitSystem);

        // Now pass the collected data to the BMI calculation
        double bmi = calculateBMI(unitSystem, input.height, input.weight); // Capture the returned BMI

        // Placeholder for displaying results
        displayResults(input.name, bmi);

        displayBMITable(unitSystem, input.name, input.height, bmi);
    }

    // Method to display welcome message
    private static void welcomeMessage() {
        System.out.println("\n----------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %50s\n", "--", "BODY MASS INDEX (BMI) Computation, CSC 215, English version");
        System.out.printf("%-10s %50s\n", "--", "by Marty Martin");
        System.out.println("\n----------------------------------------------------------------------------------------------------");
    }

    // Method to get the unit system choice from the user
    private static String getUnitSystemChoice() {
        String input;

        System.out.println("My CSC 215 BMI Calculator Projects:");
        System.out.println("1. BMI, English");
        System.out.println("2. BMI, Metric");
        System.out.println("\n[ USER MANUAL ] Enter an exclamation mark ! to end.");
        System.out.print("Please enter the version you want to try: ");

        while (true) {
            input = scanner.nextLine();
            if ("English".equals(input) || "Metric".equals(input)) {
                break;
            } else {
                System.out.print("Invalid choice. Please enter 'English' or 'Metric': ");
            }
        }

        return input;
    }


    // Method to handle user input
    private static UserInput handleUserInput(String unitSystem) {
        System.out.println("\nPlease enter your full name:");
        String name = scanner.nextLine();

        double height;
        double weight;

        if ("English".equalsIgnoreCase(unitSystem)) {
            System.out.print("Enter your height (feet and inches separated by a space): ");
            int heightFeet = scanner.nextInt();
            int heightInches = scanner.nextInt();


            System.out.print("Enter your weight (pounds): ");
            weight = scanner.nextDouble();
            height = convertFeetAndInchesToInches(heightFeet, heightInches);
        } else {
            System.out.print("Enter your height in centimeters: ");
            int heightCentimeters = scanner.nextInt();
            height = convertCentimetersToMeter(heightCentimeters);
            System.out.print("Enter your weight in kilograms: ");
            weight = scanner.nextDouble();
        }

        return new UserInput(name, height, weight);
    }

    // Helper Methods Conversion Feet and Inches to Inches
    private static double convertFeetAndInchesToInches(int feet, int inches) {
        return feet * 12 + inches;
    }

    // Helper Methods Conversion Centimeters to Meter
    private static double convertCentimetersToMeter(int heightCentimeters) {
        return (double) heightCentimeters / 100;
    }

    // BMI Calculation
    private static double calculateBMI(String unitSystem, double height, double weight) {
        double bmi;
        if ("English".equalsIgnoreCase(unitSystem)) {
            bmi = (703 * weight) / (height * height);
        } else {
            bmi = weight / (height * height);
        }
        return bmi;
    }

    // Display Results
    private static void displayResults(String name, double bmi) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm:ss a");
        String formattedDate = now.format(formatter);

        String weightStatus;
        if (bmi < 18.5) {
            weightStatus = "Underweight";
        } else if (bmi < 25) {
            weightStatus = "Normal weight";
        } else if (bmi < 30) {
            weightStatus = "Overweight";
        } else {
            weightStatus = "Obesity";
        }

        System.out.printf("%-20s %s%n", "-- SUMMARY REPORT for", name);
        System.out.printf("%-20s %s%n", "-- Date and Time:", formattedDate);
        System.out.printf("%-20s %.2f (or %.1f if rounded)%n", "-- BMI:", bmi, bmi);
        System.out.printf("%-20s %s%n", "-- Weight Status:", weightStatus);
    }

    private static void displayBMITable(String unitSystem, String name,double height, double bmi) {
        String unit = unitSystem.equals("English") ? "pounds" : "kilograms";
        String weightFormat = "English".equals(unitSystem) ? "%.1f" : "%.2f";

        System.out.printf("Please enter a LOW weight in %s for %s: ", unit, name);
        double lowWeight = scanner.nextDouble();

        System.out.printf("Please enter a HIGH weight in %s for %s: ", unit, name);
        double highWeight = scanner.nextDouble();

        double increment = (highWeight - lowWeight) / 19;
        increment = unitSystem.equals("English") ? Math.max(1.0, increment) : Math.max(0.5, increment); // Ensure at least 1 pound or 0.5 kg increment

        System.out.printf("%-10s | %-6s | %-15s |%n", "WEIGHT", "BMI", "WEIGHT STATUS");
        System.out.println("--------------------------------------------------");
        for (double weight = lowWeight; weight <= highWeight; weight += increment) {
            double bmiTable = calculateBMI(unitSystem, height, weight);

            String weightStatus;
            if (bmiTable < 18.5) {
                weightStatus = "Underweight";
            } else if (bmiTable < 25) {
                weightStatus = "Normal weight";
            } else if (bmiTable < 30) {
                weightStatus = "Overweight";
            } else {
                weightStatus = "Obesity";
            }
            // Highlight the low and high weight with special indicators
            String highlight = "";
            if (weight == lowWeight) {
                highlight = " (LOW)";
            } else if (weight == highWeight) {
                highlight = " (HIGH)";
            }

            System.out.printf("| %8s | %-6.2f | %-15s %s |%n", String.format(weightFormat, weight), bmiTable, weightStatus, highlight);
        }

        // Print the footer of the table
        System.out.println("--------------------------------------------------");
        System.out.println("The SFSU Mashouf Wellness Center is at 755 Font Blvd.");
        System.out.printf("-- Thank you for using my program, %s!%n", "Marty Martin");
        System.out.println("-- Poopaye!!!");

    }
}

class UserInput {
    String name;
    double height; 
    double weight;


    UserInput(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}
