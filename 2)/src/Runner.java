/*
Exercise 2: (1) Define an object reference and initialize it to null. Try to call a method
through this reference. Now wrap the code in a try-catch clause to catch the exception.
 */
public class Runner {
    public void print() {

    }
    public static void main(String[] args) {
        Runner r = null;
        try {
            r.print();
        }
        catch(NullPointerException t) {
            System.err.println(t.getMessage());
        }

    }
}
