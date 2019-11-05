package src.second;

import first.Task;

public class Queue extends AbstractContainer {

    public Queue() {
        super();
    }

    @Override
    public Task pop() {
        if (getContainer().isEmpty()) {
            return null;
        }

        Task first = getContainer().remove(0);

        return first;
    }

}