package exceptions;

public class Ex1 extends Exception {
    public Ex1() {
        super("Ex1");
    }
    public Ex1(String s) {
        super(s);
    }
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
