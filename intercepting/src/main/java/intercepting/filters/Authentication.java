package intercepting.filters;

public class Authentication implements Filter {

    public Authentication() {
    }

    ;

    @Override
    public void execution(String name) {
        System.out.println("Authentication OK for" + name);
    }

    ;
}
