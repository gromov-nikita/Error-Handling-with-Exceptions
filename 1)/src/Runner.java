/*
Exercise 1: (2) Create a class with a main( ) that throws an object of class Exception
inside a try block. Give the constructor for Exception a String argument. Catch the
exception inside a catch clause and print the String argument. Add a finally clause and
print a message to prove you were there.
 */
public class Runner extends Exception {
    public static void main(String[] args) throws Exception {
        Exception e = new Exception("<<<Exception>>>");
        try {
            throw e;
        }
        catch(Exception t) {
            System.out.println(t.getMessage());
        }
        finally {
            System.out.println("Error finally");
        }
    }

}
