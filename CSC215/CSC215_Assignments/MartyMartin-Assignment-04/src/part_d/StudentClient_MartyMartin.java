package part_d;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentClient_MartyMartin {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = CreateStudent(scanner);
        DisplayStudent("The 3 students created:", students);
        UpdateStudent(scanner, students);
        DisplayStudent("The 3 students updated:", students);
        scanner.close();
    }

    public static void main(String[] args) {
        StudentClient_MartyMartin client = new StudentClient_MartyMartin();
        client.runStudentManagementSystem();
    }

    private void runStudentManagementSystem() {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = CreateStudent(scanner);
        DisplayStudent("The 3 students created:", students);
        UpdateStudent(scanner, students);
        DisplayStudent("The 3 students updated:", students);
        scanner.close();
    }

    private List<Student> CreateStudent(Scanner scanner) {
        List<Student> students = new ArrayList<>();
        System.out.println("[+] Creating 3 students...");
        for (int i = 0; i < 3; i++) {
            System.out.printf("- Enter a name for student #%d: ", i + 1);
            String name = scanner.nextLine();
            System.out.printf("- Enter a GPA for student #%d: ", i + 1);
            double gpa = Double.parseDouble(scanner.nextLine());
            students.add(new Student(name, gpa));
            System.out.println();
        }
        return students;
    }

    private void DisplayStudent(String header, List<Student> students) {
        System.out.println(header);
        for (Student student : students) {
            System.out.println(student); // calling the toString() method of Student
        }
    }

    private void UpdateStudent(Scanner scanner, List<Student> students) {
        System.out.println();
        System.out.println("[-] Enter a student's full name to update the student:");
        String nameToUpdate = scanner.nextLine();
        Student studentToUpdate = FindStudent(students, nameToUpdate);
        if (studentToUpdate != null) {
            UpdateStudent(scanner, studentToUpdate);
        } else {
            System.out.println("Student not found.");
        }
    }

    private Student FindStudent(List<Student> students, String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    private void UpdateStudent(Scanner scanner, Student studentToUpdate) {
        System.out.println("Enter new student name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new student gpa: ");
        double newGpa = Double.parseDouble(scanner.nextLine());
        studentToUpdate.setName(newName);
        studentToUpdate.setGpa(newGpa);
    }
}
