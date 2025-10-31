public class Class1 {
    private double x;
    private double y;

    public Class1(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String getTextRepresentation() {
        return "{" + x + ";" + y + "}";
    }

    // Геттеры и сеттеры
    public double getX() { return x; }
    public double getY() { return y; }
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setCoordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }
}