package inning;

public interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
    public static void myEx() throws UmpireException {
        throw new UmpireException();
    }
    public static void myEx(String s) throws UmpireException {
        throw new UmpireException(s);
    }
}
