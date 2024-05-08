package part_b;

public class Student {
    private final Book book;
    private final Backpack backpack;
    private final Laptop laptop;

    public Student(Book book, Backpack backpack, Laptop laptop) {
        this.book = book;
        this.backpack = backpack;
        this.laptop = laptop;
    }

    // Getters and Setters
    public Book getBook() {
        return book;
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public Laptop getLaptop() {
        return laptop;
    }
}
