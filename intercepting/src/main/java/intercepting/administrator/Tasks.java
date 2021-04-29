package intercepting.administrator;

import intercepting.filters.Filter;
import intercepting.targets.Target;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Tasks {
    private List<Filter> tasks = new LinkedList<>();
    private Optional<Target> target;

    public Tasks() {
    }

    public List<Filter> getTasks() {
        return this.tasks;
    }

    public Optional<Target> getTarget() {
        return this.target;
    }

    public void setTarget(Target target) {
        this.target = Optional.ofNullable(target);
    }

    public void addTask(Filter filter) {
        getTasks().add(filter);
    }


    public void execution(String message) {
        List<Filter> tasks = getTasks();
        for (Filter task : tasks) {
            if (getTarget().isPresent()) {
                task.execution(message);
            }

        }
    }
}