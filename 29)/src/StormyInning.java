import exceptions.*;


public class StormyInning extends Inning implements Storm {
    // OK to add new exceptions for constructors, but you
    // must deal with the base constructor exceptions:
    public StormyInning()
            throws RainedOut, BaseballException {}
    public StormyInning(String s)
            throws Foul, BaseballException {}
    // Regular methods must conform to base class:
    public void walk() {} //Compile error
    // Interface CANNOT add exceptions to existing
    // methods from the base class:
 public void event() {}
    // If the method doesn’t already exist in the
    // base class, the exception is OK:
    public void rainHard() {}
// You can choose to not throw any exceptions,
// even if the base version does:
//!public void event() {}
    // Overridden methods can throw inherited exceptions:
    public void atBat() {}
    public static void main(String[] args) {

            StormyInning si = new StormyInning();
            si.atBat();
        // Strike not thrown in derived version.
            // What happens if you upcast?
            Inning i = new StormyInning();
            i.atBat();
            // You must catch the exceptions from the
            // base-class version of the method:

    }
}