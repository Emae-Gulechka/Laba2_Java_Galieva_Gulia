public class Class4_1 {
    private final double x;
    private final double y;

    // Конструктор с обязательными координатами
    public Class4_1(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String getTextRepresentation() {
        return "{" + x + ";" + y + "}";
    }

    // Только геттеры (без сеттеров, так как координаты final)
    public double getX() { return x; }
    public double getY() { return y; }
}