package model.exception;

public class InsufficientValue extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public InsufficientValue(String msg) {
        super(msg);

    }
}
