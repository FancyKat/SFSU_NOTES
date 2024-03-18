package part_c;

import java.util.Arrays;

public class PlantCalculation {
    private final int[] avgTemp = {46, 48, 49, 50, 51, 53, 54, 55, 56, 55, 51, 47};
    private final int[] avgWater = {5, 3, 3, 1, 1, 0, 0, 0, 0, 1, 3, 4};

    private final int[] growth;
    private final int[] height;

    public PlantCalculation() {
        this.growth = new int[avgTemp.length];
        this.height = new int[avgTemp.length];
    }

    public void calculateGrowth(int tempLow, int tempHigh, int waterInput) {
        int runningHeight = 0;
        for (int i = 0; i < avgTemp.length; i++) {
            boolean tempCondition = avgTemp[i] >= tempLow && avgTemp[i] <= tempHigh;
            boolean waterCondition = avgWater[i] > waterInput;

            if (tempCondition && waterCondition) {
                growth[i] = avgWater[i] - waterInput;
                runningHeight += growth[i];
            } else {
                // When conditions are not met, reduce the height by 1 but not below 0
                growth[i] = -1;
                runningHeight = Math.max(0, runningHeight - 1);
            }

            height[i] = runningHeight;
        }
    }

    public int[] getGrowth() {
        return growth;
    }

    public int[] getHeight() {
        return height;
    }
}
