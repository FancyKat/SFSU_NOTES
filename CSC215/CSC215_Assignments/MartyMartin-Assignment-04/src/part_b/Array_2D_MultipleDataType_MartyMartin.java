package part_b;

import java.util.Scanner;

public class Array_2D_MultipleDataType_MartyMartin {
    public void display() {
        Object[][] inputDatabase = new Object[4][3];
        Scanner scanner = new Scanner(System.in);

        // Input data from the user
        System.out.print("Row 1 | Please enter 3 Integers:    ");
        for (int j = 0; j < 3; j++) {
            inputDatabase[0][j] = scanner.nextInt();
        }

        System.out.print("Row 2 | Please enter 3 Characters:  ");
        for (int j = 0; j < 3; j++) {
            inputDatabase[1][j] = scanner.next().charAt(0);
        }

        System.out.print("Row 3 | Please enter 3 Strings:     ");
        for (int j = 0; j < 3; j++) {
            inputDatabase[2][j] = scanner.next();
        }

        System.out.print("Row 4 | 1 Int, 1 Char, 1 String:    ");
        inputDatabase[3][0] = scanner.nextInt();
        inputDatabase[3][1] = scanner.next().charAt(0);
        inputDatabase[3][2] = scanner.next();

        // Determine maximum width needed for each column and add padding
        int[] maxWidths = new int[3];
        for (int i = 0; i < 3; i++) {
            for (Object[] row : inputDatabase) {
                maxWidths[i] = Math.max(maxWidths[i], row[i].toString().length());
            }
        }

        int padding = 25;  // General padding for each element
        int leadingSpaceCount = 15;  // Leading spaces before the first element in each row
        for (int i = 0; i < maxWidths.length; i++) {
            maxWidths[i] += padding;
        }

        System.out.println();
        System.out.println("Your 2D array of multiple data types:");
        System.out.println();

        // Data Type View with spacing before the first element
        System.out.println("- Data Type View:");
        for (Object[] row : inputDatabase) {
            System.out.printf("%" + leadingSpaceCount + "s", "");  // Print leading spaces for the first element
            for (int i = 0; i < row.length; i++) {
                System.out.printf("%-" + maxWidths[i] + "s", row[i].getClass().getSimpleName());
            }
            System.out.println();
        }

        // Data Value View with spacing before the first element
        System.out.println("\n- Data Value View:");
        for (Object[] row : inputDatabase) {
            System.out.printf("%" + leadingSpaceCount + "s", "");  // Print leading spaces for the first element
            for (int i = 0; i < row.length; i++) {
                System.out.printf("%-" + maxWidths[i] + "s", row[i]);
            }
            System.out.println();
        }
    }
}
