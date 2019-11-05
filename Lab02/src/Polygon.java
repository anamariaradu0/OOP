public class Polygon {
    int n;
    Point[] points;

    public Polygon(int n) {
        Point[] points = new Point[n];
    }

    public Polygon(float vec[]) {
        int sz = vec.length;
        sz /= 2;
        int j = 0;
        Point[] points = new Point[sz];
        for (int i = 0; i < vec.length; i += 2) {
            points[j].a = vec[i];
            points[j].b = vec[i+1];
            ++j;
        }
    }
}
