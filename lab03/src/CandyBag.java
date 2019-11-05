import java.util.ArrayList;
import java.util.Iterator;
import java.util.ArrayList;

public class CandyBag {
    ArrayList<CandyBox> present = new ArrayList<CandyBox>();

    ChocAmor choc1 = new ChocAmor("cherry", "chocamor", 3);
    ChocAmor choc2 = new ChocAmor("cherry", "chocamor", 3);
    Lindt l1 = new Lindt("choco", "lindt", 1, 1, 1);
    Lindt l2 = new Lindt("choco", "lindt", 1, 1, 1);
    Baravelli b1 = new Baravelli("vanilla", "baravelli", 1, 1);

    public void addCandy() {
        present.add(choc1);
        present.add(choc2);
        present.add(l1);
        present.add(l2);
        present.add(b1);
    }

    public void printFlavors() {
        for(CandyBox c : present) {
            System.out.println(c.getFlavor());
        }
    }

}
