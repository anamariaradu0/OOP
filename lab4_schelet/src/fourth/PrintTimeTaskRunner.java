package src.fourth;

import first.Task;
import third.Strategy;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PrintTimeTaskRunner extends AbstractTaskRunner {
    private Calendar rightNow = Calendar.getInstance();
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    public PrintTimeTaskRunner(Strategy strategy) {
        super(strategy);
    }

    @Override
    protected void afterExecution(Task task) {
        System.out.println(formatter.format(rightNow.getTime()));
    }
}
