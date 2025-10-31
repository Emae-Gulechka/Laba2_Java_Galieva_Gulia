public class Class4_2 {
    private Class4_1 start;
    private Class4_1 end;

    // Конструктор с точками
    public Class4_2(Class4_1 start, Class4_1 end) {
        this.start = start;
        this.end = end;
    }

    // Конструктор с координатами
    public Class4_2(double x1, double y1, double x2, double y2) {
        this.start = new Class4_1(x1, y1);
        this.end = new Class4_1(x2, y2);
    }

    public String getTextRepresentation() {
        return "Линия от " + start.getTextRepresentation() + " до " + end.getTextRepresentation();
    }

    // Геттеры
    public Class4_1 getStart() { return start; }
    public Class4_1 getEnd() { return end; }
}