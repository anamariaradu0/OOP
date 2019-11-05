public class ChocAmor extends CandyBox{
    private float length;

    public ChocAmor() {
        super();

        this.length = 0;
    }

    public ChocAmor(String flavor, String origin, float length) {
        super(flavor, origin);

        this.length = length;
    }

    public float getVolume() {
        super.getVolume();
        return length * length * length;
    }

    public String toString() {
        float volume = getVolume();
        return "The "+ super.toString() + " has volume " + volume;
    }

    public void printChocAmorDim() {
        System.out.println(length);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public void prints() {
        System.out.println(toString());
        printChocAmorDim();
    }
}
