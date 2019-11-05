import java.util.ArrayList;

final class MyImmutableArray {
    ArrayList<Integer> immutableArray;

    public MyImmutableArray(ArrayList<Integer> immutableArray) {
        // A very sad shallow copy
        this.immutableArray = new ArrayList<Integer>();
        this.immutableArray.addAll(immutableArray);
    }

    public ArrayList<Integer> getArray() {
        MyImmutableArray copy = new MyImmutableArray((immutableArray));
        return immutableArray;
    }


    public ArrayList<Integer> initArrayList(int number) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < number; ++i) {
            list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(2);
        array.add(3);
        MyImmutableArray immutableArray = new MyImmutableArray(array);
        System.out.println(immutableArray.getArray());
        array.add(4);

        MyImmutableArray immutableArray2 = new MyImmutableArray(array);
        System.out.println(immutableArray.getArray());
    }

}
