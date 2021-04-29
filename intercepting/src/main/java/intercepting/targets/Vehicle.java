package intercepting.targets;

public class Vehicle implements Target{

    public Vehicle(){};

    @Override
    public void execution(String id){
        System.out.println("Door open" + id); //No he puesto to String porque es redundante
    }


}
