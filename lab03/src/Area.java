import java.util.*;
public class Area {
    CandyBag mom;
    int number;
    String street;

    public Area() {
        mom = new CandyBag();
    }

    public Area(CandyBag mom, int number, String street) {
        this.mom = mom;
        this.number = number;
        this.street = street;
    }

    public void getBirthdayCard() {
        System.out.println(number + " " + street);
        System.out.println("LMA");

        for (int i = 0; i < mom.present.size(); ++i) {
            mom.present.get(i).prints();
        }

//        for (int i = 0; i < mom.present.size(); ++i) {
//            if (mom.present.get(i) instanceof Lindt) {
//                Lindt candy = (Lindt)mom.present.get(i);
//                candy.printLindtDim();
//            }
//            if (mom.present.get(i) instanceof Baravelli) {
//                Baravelli candy = (Baravelli)mom.present.get(i);
//                candy.printBaravelliDim();
//            }
//            if (mom.present.get(i) instanceof ChocAmor) {
//                ChocAmor candy = (ChocAmor)mom.present.get(i);
//                candy.printChocAmorDim();
//            }
//
//        }
    }
}
