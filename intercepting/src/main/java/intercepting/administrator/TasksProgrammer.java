package intercepting.administrator;

import intercepting.filters.Filter;
import intercepting.targets.Target;

import java.util.Optional;

public class TasksProgrammer {
    private Tasks tasks;

    public TasksProgrammer(Target target) {
        tasks = new Tasks();
        tasks.setTarget(target);
    }

    public Tasks getTasks() {
        return this.tasks;
    }

    public void setTasks(Filter task) {
        getTasks().addTask(task);
    }

    public void execute(String message) {
        tasks.execution(message);
    }
}
