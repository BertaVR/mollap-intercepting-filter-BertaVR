package intercepting.administrator;

import intercepting.filters.Filter;
import intercepting.targets.Target;

public class TasksProgrammer {
    private Tasks tasks = null;

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
