/*
Exercise 9: (2) Create three new types of exceptions. Write a class with a method that
throws all three. In main( ), call the method but only use a single catch clause that will
catch all three types of exceptions
 */
public class Runner {
    public static void main(String[] args) throws Exception{
        try {
            throw new NullPointerException("NULL");
        }
        catch(Exception t) {
            System.err.println(t.getMessage());
        }
        try {
            throw new ArrayIndexOutOfBoundsException("Index");
        }
        catch(Exception t) {
            System.err.println(t.getMessage());
        }
        try {
            throw new ArithmeticException("Arithmetic");
        }
        catch(Exception t) {
            System.err.println(t.getMessage());
        }
        System.out.println("__________________________________________");
    }
}
