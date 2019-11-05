public class Lindt extends CandyBox {
    private float length;
    private float width;
    private float height;

    public Lindt() {
        super();

        this.length = 0;
        this.width = 0;
        this.height = 0;
    }

    public Lindt(String flavor, String origin, float length, float width, float height) {
        super(flavor, origin);

        this.length = length;
        this.width = width;
        this.height = height;
    }

    public float getVolume() {
        super.getVolume();
        return length * width * height;
    }

    public String toString() {
        float volume = getVolume();
        return "The "+ super.toString() + " has volume " + volume;
    }

    public void printLindtDim() {
        System.out.println(length + " " + height + " " + width);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public void prints() {
       System.out.println(toString());
       printLindtDim();
    }
}
