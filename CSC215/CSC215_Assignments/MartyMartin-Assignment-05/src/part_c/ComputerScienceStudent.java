package part_c;

public class ComputerScienceStudent extends Student {
    private String favoriteProgrammingLanguage;

    public ComputerScienceStudent(String name, int age, String studentId, String favoriteProgrammingLanguage) {
        super(name, age, studentId);
        this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
    }

    // Getter and Setters
    public String getFavoriteProgrammingLanguage() {
        return favoriteProgrammingLanguage;
    }

    public void setFavoriteProgrammingLanguage(String favoriteProgrammingLanguage) {
        this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
    }
}
