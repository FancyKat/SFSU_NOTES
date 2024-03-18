package part_c;

public class GardeningPlanner_MartyMartin {
    public void run() {
        DisplayMessage.displayWelcomeMessage();

        UserInput userInput = new UserInput();
        userInput.readUserInput();

        PlantCalculation plantCalc = new PlantCalculation();
        plantCalc.calculateGrowth(userInput.getMinTemperature(), userInput.getMaxTemperature(), userInput.getMinRainfall());

        // Store the calculated results back in the UserInput object
        userInput.setGrowth(plantCalc.getGrowth());
        userInput.setHeight(plantCalc.getHeight());

        // Display the calculated results
        DisplayMessage.displayResults(userInput.getGrowth(), userInput.getHeight());
    }
}
