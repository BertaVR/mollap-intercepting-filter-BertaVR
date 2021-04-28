package intercepting.administrator;

import intercepting.filters.Filter;
import intercepting.targets.Target;

import java.nio.file.DirectoryStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Tasks {
    public Tasks() {
    }

    private List <Filter> tasks = new LinkedList<>();

    private Optional<Target> target ;

    public List<Filter> getTasks(){
        return this.tasks;
    }

    public Optional<Target> getTarget() {
        return target;
    }

    public void setTarget(Optional<Target> target) {
        this.target = target;
    }

    public void addTask(Filter filter){
        getTasks().add(filter);
    }

    public void execution(String name){
        getTasks().forEach(item -> item.execution(name));
        if (getTarget().isPresent()){
            getTarget().get().execution(name);
        }
        else{
            System.out.print("Not available");
        }
    }

}
