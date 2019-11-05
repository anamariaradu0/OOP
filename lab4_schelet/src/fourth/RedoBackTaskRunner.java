package src.fourth;

import second.Container;
import src.third.ContainerFactory;
import third.Strategy;



public class RedoBackTaskRunner extends AbstractTaskRunner {
    private Container reversedContainer;

    public RedoBackTaskRunner(Strategy strategy) {
        super(strategy);
        reversedContainer = ContainerFactory.INSTANCE.createContainer(Strategy.LIFO);
    }

    public void redo() {
        while (!reversedContainer.isEmpty())
            reversedContainer.pop().execute();
    }

    @Override
    protected void afterExecution(first.Task task) {
        reversedContainer.push(task);
    }
}
