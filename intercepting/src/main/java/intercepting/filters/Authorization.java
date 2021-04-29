package intercepting.filters;

public class Authorization implements Filter {

    public Authorization() {
    }


    @Override
    public void execution(String message) {
        System.out.println("Authorization OK for" + message.toString());
    }


}
