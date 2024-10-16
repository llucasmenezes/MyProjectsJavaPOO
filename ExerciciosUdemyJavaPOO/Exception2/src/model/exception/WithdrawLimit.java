package model.exception;


public class WithdrawLimit extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public WithdrawLimit(String msg) {
        super(msg);
    }
}
