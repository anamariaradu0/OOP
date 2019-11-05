public class Main2 {
    public static void main(String[] args) {
        int n = 3;
        float[] vec = {1.2f, 1.3f, 1.4f, 1.5f, 1.6f, 1.7f};

        Polygon p = new Polygon(vec);

        for (int i = 0; i < n; ++i) {
            p.points[i].PrintPoint();
        }
    }
}
