import part_a.Array_2D_SingleDataType_MartyMartin;
import part_b.Array_2D_MultipleDataType_MartyMartin;
import part_c.GardeningPlanner_MartyMartin;
import part_d.StudentClient_MartyMartin;
import part_e.DegreePlanner_3DArray_MartyMartin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Array_2D_SingleDataType_MartyMartin obj1 = new Array_2D_SingleDataType_MartyMartin();
        Array_2D_MultipleDataType_MartyMartin obj2 = new Array_2D_MultipleDataType_MartyMartin();
        GardeningPlanner_MartyMartin obj3 = new GardeningPlanner_MartyMartin();
        StudentClient_MartyMartin obj4 = new StudentClient_MartyMartin();
        DegreePlanner_3DArray_MartyMartin obj5 = new DegreePlanner_3DArray_MartyMartin();

        int choice;
        do {
            System.out.println("\nSelect an option:");
            System.out.println("1 - Array 2D Single Data Type");
            System.out.println("2 - Array 2D Multiple Data Type");
            System.out.println("3 - Gardening Planner");
            System.out.println("4 - Student Client");
            System.out.println("5 - Degree Planner");
            System.out.println("0 - Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    obj1.display(args);
                    break;
                case 2:
                    obj2.display();
                    break;
                case 3:
                    obj3.run();
                    break;
                case 4:
                    obj4.run();
                    break;
                case 5:
                    obj5.display();
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid option selected. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}

