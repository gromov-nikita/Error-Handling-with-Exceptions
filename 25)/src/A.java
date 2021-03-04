import exceptions.*;

public class A {
    public void throwEx() throws Ex1 {
        throw new Ex1();
    }
    public void throwEx(String s) throws Ex1 {
        throw new Ex1(s);
    }
}
