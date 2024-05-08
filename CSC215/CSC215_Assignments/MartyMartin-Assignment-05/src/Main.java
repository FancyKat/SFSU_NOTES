import part_b.OOP_ClassRelationship_HAS_A_MartyMartin;
import part_c.OOP_ClassRelationship_Inheritance_IS_A_MartyMartin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        OOP_ClassRelationship_HAS_A_MartyMartin obj1 = new OOP_ClassRelationship_HAS_A_MartyMartin();
        OOP_ClassRelationship_Inheritance_IS_A_MartyMartin obj2 = new OOP_ClassRelationship_Inheritance_IS_A_MartyMartin();

        int choice;
        do {
            System.out.println("\nSelect an option:");
            System.out.println("1 - Part B");
            System.out.println("2 - Part C");
            System.out.println("0 - Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    obj1.run(args);
                    break;
                case 2:
                    obj2.run(args);
                    break;
                default:
                    System.out.println("Invalid option selected. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}

