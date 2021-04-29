package intercepting.clients;

import intercepting.administrator.TasksProgrammer;

public class Mollapp implements Client {

    private TasksProgrammer programmer;

    ;

    public Mollapp() {
    }

    @Override
    public void setTasksProgrammer(TasksProgrammer programmer) {
        this.programmer = programmer;
    }


    @Override
    public void sendRequest(String id) {
        programmer.execute(id);
    }

    ;


}
