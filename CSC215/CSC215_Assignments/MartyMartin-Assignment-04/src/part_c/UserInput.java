package part_c;

import java.util.Scanner;

public class UserInput {
    private int minTemperature;
    private int maxTemperature;
    private int minRainfall;
    private int[] growth;  // To store growth results
    private int[] height;  // To store height results

    public void readUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter minimum temperature for plant: ");
        this.minTemperature = scanner.nextInt();

        System.out.print("Enter maximum temperature for plant: ");
        this.maxTemperature = scanner.nextInt();

        System.out.print("Enter minimum rainfall for plant: ");
        this.minRainfall = scanner.nextInt();

        scanner.close();
    }

    // Getters for the input values
    public int getMinTemperature() {
        return minTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public int getMinRainfall() {
        return minRainfall;
    }

    // Setters and getters for the results
    public void setGrowth(int[] growth) {
        this.growth = growth;
    }

    public void setHeight(int[] height) {
        this.height = height;
    }

    public int[] getGrowth() {
        return growth;
    }

    public int[] getHeight() {
        return height;
    }
}
