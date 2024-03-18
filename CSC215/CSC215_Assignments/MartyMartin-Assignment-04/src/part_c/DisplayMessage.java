package part_c;

public class DisplayMessage {
    private static final String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private static final int[] avgTemp = {46, 48, 49, 50, 51, 53, 54, 55, 56, 55, 51, 47};
    private static final int[] avgWater = {5, 3, 3, 1, 1, 0, 0, 0, 0, 1, 3, 4};

    // Nested FindMax utility class
    private static final class FindMax {
        private FindMax() {
            // Private constructor to prevent instantiation
        }

        public static int findMax(final int[] array) {
            if (array.length == 0) {
                throw new IllegalArgumentException("Array must be non-empty.");
            }

            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }
    }

    public static void displayWelcomeMessage() {
        int width = 89;
        printLine(width);
        System.out.println("Welcome");
        printLine(width);
    }

    private static void printLine(int width) {
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void displayResults(int[] growth, int[] height) {
        int maxHeight = FindMax.findMax(height);
        System.out.println(maxHeight);
        printLine(89);
        System.out.printf("%-14s %-14s %-14s %-14s %-14s %-14s%n", "INDEX", "MONTH", "TEMPERATURE", "RAINFALL", "PLANT GROWTH", "PLANT HEIGHT");
        printLine(89);

        for (int i = 0; i < months.length; i++) {
            String growthDisplay = growth[i] > 0 ? "+" + growth[i] : String.valueOf(growth[i]);
            String heightDisplay = String.valueOf(height[i]);
            String maxIndicator = height[i] == maxHeight ? "     MAX" : "";

            // Adjust the spacing for MAX indicator based on its presence
            String formatSpecifier = height[i] == maxHeight ? "%-9s" : "%-14s";

            System.out.printf("%-14d %-14s %-14d %-14d %-14s " + formatSpecifier + "%n",
                    i, months[i], avgTemp[i], avgWater[i], growthDisplay, heightDisplay + maxIndicator);
        }


        printLine(89);
    }
}
