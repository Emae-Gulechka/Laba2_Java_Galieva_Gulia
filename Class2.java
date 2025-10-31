public class Class2 {
    private Class1 start;
    private Class1 end;

    public Class2(Class1 start, Class1 end) {
        this.start = start;
        this.end = end;
    }

    public String getTextRepresentation() {
        return "Линия от " + start.getTextRepresentation() + " до " + end.getTextRepresentation();
    }

    // Геттеры и сеттеры
    public Class1 getStart() { return start; }
    public Class1 getEnd() { return end; }
    public void setStart(Class1 start) { this.start = start; }
    public void setEnd(Class1 end) { this.end = end; }
}