package part_b;

public class Book {
    // Book properties (e.g., title, author)
    private final String title;
    private final String author;

    // Constructor, getters, and setters
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
