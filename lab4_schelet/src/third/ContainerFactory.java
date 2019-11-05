package src.third;

import third.Strategy;
import second.Container;
import src.second.Stack;
import src.second.Queue;

public class ContainerFactory implements IFactory {
    public static final ContainerFactory INSTANCE = new ContainerFactory();

    private ContainerFactory() {
    }

    public Container createContainer(Strategy strategy) {
        if (strategy == Strategy.FIFO) {
            return new Queue();
        }

        if (strategy == Strategy.LIFO) {
            return new Stack();
        }

        return null;
    }
}