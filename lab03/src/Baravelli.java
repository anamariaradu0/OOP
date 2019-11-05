public class Baravelli extends CandyBox {
    private float radius;
    private float height;

    public Baravelli() {
        super();

        this.radius = 0;
        this.height = 0;
    }

    public Baravelli(String flavor, String origin, float radius, float height) {
        super(flavor, origin);

        this.radius = radius;
        this.height = height;
    }

    public float getVolume() {
        super.getVolume();
        return 3.14f * radius * radius * height;
    }

    public String toString() {
        float volume = getVolume();
        return "The "+ super.toString() + " has volume " + volume;
    }

    public void printBaravelliDim() {
        System.out.println(radius + " " + height);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public void prints() {
        System.out.println(toString());
        printBaravelliDim();
    }
}
