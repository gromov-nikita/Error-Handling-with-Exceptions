/*
Exercise 13: (2) Modify Exercise 9 by adding a finally clause. Verify that your finally
clause is executed, even if a NullPointerException is thrown.

 Exercise 9: (2) Create three new types of exceptions. Write a class with a method that
throws all three. In main( ), call the method but only use a single catch clause that will
catch all three types of exceptions.
 */
public class Runner {
    public static void e(int n) throws NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException {
        switch(n) {
            case 1 :
                throw new ArrayIndexOutOfBoundsException("Index");
            case 2 :
                throw new ArithmeticException("Arithmetic");
            case 3 :
                throw new NullPointerException("NULL");
        }
    }
    public static void main(String[] args) throws Exception {
        try {
            Runner.e(3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("FINALLY__________________________________________");
        }
    }
}
