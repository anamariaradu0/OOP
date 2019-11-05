package src.second;

import first.Task;
import second.Container;
import java.util.ArrayList;

public abstract class AbstractContainer implements Container {

    private ArrayList<Task> container;

    AbstractContainer() {
        container = new ArrayList<Task>(10);
    }

    ArrayList<Task> getContainer() {
        return container;
    }

    @Override
    public void push(Task task) {
        getContainer().add(task);
    }

    @Override
    public int size() {
        return getContainer().size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void transferFrom(Container container) {
        while (container.isEmpty()) {
            push(container.pop());
        }
    }

}
