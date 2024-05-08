package part_c;

public class OOP_ClassRelationship_Inheritance_IS_A_MartyMartin {

    // Correctly defined static run method
    public static void run(String[] args) {
        ComputerScienceStudent csStudent = new ComputerScienceStudent("Marty Martin", 21, "CS215", "Java");

        System.out.println("Name: " + csStudent.getName());
        System.out.println("Age: " + csStudent.getAge());
        System.out.println("Student ID: " + csStudent.getStudentId());
        System.out.println("Favorite Programming Language: " + csStudent.getFavoriteProgrammingLanguage());
    }

    // Main method that calls the run method
    public static void main(String[] args) {
        run(args);
    }
}
