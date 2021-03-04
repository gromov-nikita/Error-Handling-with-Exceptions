import exceptions.Ex3;

public class C extends B {
    @Override
    public void throwEx() throws Ex3 {
        throw new Ex3();
    }
    @Override
    public void throwEx(String s) throws Ex3 {
        throw new Ex3(s);
    }
}
