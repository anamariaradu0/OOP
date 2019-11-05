public class CandyBox {
    private String flavor;
    private String origin;

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public CandyBox() {
        this.flavor = new String();
        this.origin = new String();
    }

    public CandyBox(String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    public float getVolume() { return 0; }

    public String toString() {
        return flavor + " " + origin;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public void prints() {}
}
