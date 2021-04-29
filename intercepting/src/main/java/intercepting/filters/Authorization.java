package intercepting.filters;

public class Authorization implements Filter {

    public Authorization() {
    }

    ;

    @Override
    public void execution(String name) {
        System.out.println("Authorization OK for" + name);
    }

    ;


}
