public class Complex {
    private int real;
    private int imaginary;

    // Constructors
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex() {
        this(0,0);
    }

    // Copy-Constructor
    public Complex(Complex obj) {
        this.real = obj.real;
        this.imaginary = obj.imaginary;
    }

    // Getters
    public int etReal() { return real; }

    public int getImaginary() { return imaginary; }

    // Setters
    public void setReal(int real) { this.real = real; }

    public void setImaginary(int imaginary) { this.imaginary = imaginary; }

    // Methods
    public void addWithComplex(Complex other) {
        this.real += other.real;
        this.imaginary += other.imaginary;
    }

    public void showNumber() {
        System.out.println("RE" + real + " IM" + imaginary);
    }
}
