package inning;

public class UmpireException extends Exception {
    public UmpireException() {
        super("UmpireException");
    }
    public UmpireException(String s) {
        super(s);
    }
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
