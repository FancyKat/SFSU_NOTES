package part_b;

public class OOP_ClassRelationship_HAS_A_MartyMartin {

    public void run(String[] args) {
        Book book = new Book("Effective Java", "Marty Martin");
        Backpack backpack = new Backpack("blue", 15);
        Laptop laptop = new Laptop("Dell", "XPS 15");

        Student student = new Student(book, backpack, laptop);

        System.out.println("The student has a " + student.getBook().getTitle() + " book.");
        System.out.println("The student's backpack is " + student.getBackpack().getColor() + " and can carry " + student.getBackpack().getSize() + " items.");
        System.out.println("The student uses a " + student.getLaptop().getBrand() + " laptop.");
    }

    public static void main(String[] args) {
        OOP_ClassRelationship_HAS_A_MartyMartin obj1 = new OOP_ClassRelationship_HAS_A_MartyMartin();
        obj1.run(args);
    }
}
