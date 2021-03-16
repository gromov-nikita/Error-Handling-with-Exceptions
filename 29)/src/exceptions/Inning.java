package exceptions;

public abstract class Inning {
    public Inning() {}
    public void event() {
        // Doesn’t actually have to throw anything
    }
    public abstract void atBat();
    public void walk() {} // Throws no checked exceptions
}
