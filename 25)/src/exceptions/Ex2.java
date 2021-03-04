package exceptions;

public class Ex2 extends Ex1 {
    public Ex2() {
        super("Ex2");
    }
    public Ex2(String s) {
        super(s);
    }
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
