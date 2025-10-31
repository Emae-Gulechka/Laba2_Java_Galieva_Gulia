import java.util.Arrays;

public class Class3 {
    private String name;
    private int[] grades;

    public Class3(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getTextRepresentation() {
        return name + ": " + Arrays.toString(grades);
    }

    // Геттеры и сеттеры
    public String getName() { return name; }
    public int[] getGrades() { return grades; }
    public void setName(String name) { this.name = name; }
    public void setGrades(int[] grades) { this.grades = grades; }

    // Метод для копирования оценок без ссылки
    public static int[] copyGrades(int[] original) {
        return Arrays.copyOf(original, original.length);
    }
}