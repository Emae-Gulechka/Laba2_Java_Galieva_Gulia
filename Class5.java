public class Class5 {
    private Class4_1 start;
    private Class4_1 end;

    public Class5(Class4_1 start, Class4_1 end) {
        this.start = start;
        this.end = end;
    }

    public Class5(double x1, double y1, double x2, double y2) {
        this.start = new Class4_1(x1, y1);
        this.end = new Class4_1(x2, y2);
    }

    public String getTextRepresentation() {
        return "Линия от " + start.getTextRepresentation() + " до " + end.getTextRepresentation();
    }

    // Метод для вычисления длины линии
    public int getLength() {
        double dx = end.getX() - start.getX();
        double dy = end.getY() - start.getY();
        return (int) Math.sqrt(dx * dx + dy * dy);
    }

    // Геттеры
    public Class4_1 getStart() { return start; }
    public Class4_1 getEnd() { return end; }
}