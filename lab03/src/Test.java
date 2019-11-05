import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        CandyBox boxbig = new CandyBox();

        Lindt box = new Lindt("choc", "here", 13.0f, 13.0f, 13.0f );
        System.out.println(box.toString());

        Baravelli bbox = new Baravelli("mocha", "there", 1.0f, 1.0f);
        System.out.println(bbox.toString());

        ChocAmor cbox = new ChocAmor("vanilla", "far", 2.0f);
        System.out.println(cbox.toString());

        CandyBox boxsmall = new CandyBox();
        System.out.println(boxsmall.equals(boxbig));

        CandyBag present = new CandyBag();
        present.addCandy();
        present.printFlavors();

        Area x = new Area(present, 2, "Sava");
        x.getBirthdayCard();
    }
}
