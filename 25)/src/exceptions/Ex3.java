package exceptions;

public class Ex3 extends Ex2 {
    public Ex3() {
        super("Ex3");
    }
    public Ex3(String s) {
        super(s);
    }
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
