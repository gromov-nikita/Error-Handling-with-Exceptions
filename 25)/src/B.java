import exceptions.Ex2;

public class B extends A {
    @Override
    public void throwEx() throws Ex2 {
        throw new Ex2();
    }
    @Override
    public void throwEx(String s) throws Ex2 {
        throw new Ex2(s);
    }
}
