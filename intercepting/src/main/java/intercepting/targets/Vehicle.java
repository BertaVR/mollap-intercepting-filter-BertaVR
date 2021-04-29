package intercepting.targets;

public class Vehicle implements Target {

    public Vehicle() {
    }

    @Override
    public void execution(String message) {
        System.out.println("Door open" + message); //No he puesto to String porque es redundante
    }


}
