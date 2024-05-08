package part_b;

public class Laptop {
    // Laptop properties (e.g., brand, model)
    private final String brand;
    private final String model;

    // Constructor, getters, and setters
    public Laptop(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Getter methods
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
