/*
Exercise 10: (2) Create a class with two methods, f( ) and g( ). In g( ), throw an
exception of a new type that you define. In f( ), call g( ), catch its exception and, in the catch
clause, throw a different exception (of a second type that you define). Test your code in
main( ).
 */
public class Runner {
    public static void throwNullEx() {
        nullEx();
    }
    public static void nullEx() {
        throw new NullPointerException("NULLLLLLLLL...");
    }

    public static void main(String[] args) throws Exception {
        try {
            Runner.throwNullEx();
        }
        catch(NullPointerException n) {
            throw new Exception("<<<Exceprion>>>");
        }
    }
}
