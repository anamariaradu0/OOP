import java.util.Scanner;

public class PasswordMaker {
    private int age;
    private String MAGIC_STRING, name;
    private static final int MAGIC_NUMBER = 15;
    private static PasswordMaker instance;

    // Private constructor for singleton pattern
    private PasswordMaker(String name, int age) {
        this.name = name;
        this.age = age;

        RandomStringGenerator gen = new RandomStringGenerator(23, "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase() + "0123456789");
        MAGIC_STRING = gen.next();
    }

    private String getPassword() {
        RandomStringGenerator gen = new RandomStringGenerator(10, MAGIC_STRING);
        String magic = gen.next();
        gen = new RandomStringGenerator(MAGIC_NUMBER, magic);

        return name.substring(name.length() - age % 3) + gen.next() + String.valueOf(age + name.length());
    }

    // For singleton pattern
    public static PasswordMaker getInstance(String name, int age) {
        if (instance == null) {
            instance = new PasswordMaker(name, age);
        }
        System.out.println("getInstance but only once");

        return instance;
    }

    // my Main
    public static void main(String[] args) {
        String name = "AnaMaria";
        int age = 20;
        PasswordMaker pm = PasswordMaker.getInstance(name, age);

        System.out.println("Parola este " + pm.getPassword());
    }
}
