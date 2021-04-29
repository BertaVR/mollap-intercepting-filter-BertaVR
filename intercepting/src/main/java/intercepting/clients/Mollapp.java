package intercepting.clients;

import intercepting.administrator.TasksProgrammer;

public class Mollapp implements Client{

    public Mollapp(){};

    private TasksProgrammer programmer;

    @Override
    public void setTasksProgrammer(TasksProgrammer programmer){
        this.programmer = programmer;
    }


    @Override
    public void sendRequest(String id){
        programmer.execute(id);
    };


}
