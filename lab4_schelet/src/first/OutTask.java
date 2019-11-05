package src.first;

public class OutTask implements first.Task {
    String message;

    public OutTask(String message) {
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println(message);
    }
}
