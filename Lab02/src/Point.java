public class Point {
    float a;
    float b;

    public void Point(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public void ChangeCoords(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public void PrintPoint() {
        System.out.println("(" + this.a + "," + this.b + ")");
    }
}
