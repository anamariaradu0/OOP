package src.first;

public class CounterOutTask implements first.Task {
    static int count = 0;

    @Override
    public void execute() {
        count += 1;

        System.out.println(count);
    }
}
