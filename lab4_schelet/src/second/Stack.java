package src.second;

import first.Task;
import second.Container;

public class Stack extends AbstractContainer {

    public Stack() {
        super();
    }

    @Override
    public Task pop() {
        if (getContainer().isEmpty()) {
            return null;
        }

        Task last = getContainer().remove(getContainer().size() - 1);

        return last;
    }

}
