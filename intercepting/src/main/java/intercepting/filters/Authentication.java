package intercepting.filters;

public class Authentication implements Filter {

    public Authentication() {
    }

    @Override
    public void execution(String message) {
        System.out.println("Authentication OK for" + message.toString());
    }


}
