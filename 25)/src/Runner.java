import exceptions.*;
/*
Exercise 25: (2) Create a three-level hierarchy of exceptions. Now create a base-class A
with a method that throws an exception at the base of your hierarchy. Inherit B from A and
override the method so it throws an exception at level two of your hierarchy. Repeat by
inheriting class C from B. In main( ), create a C and upcast it to A, then call the method.
 */
public class Runner {
    public static void main(String[] args) throws Exception {
        C obj = new C();
        try {
            ((A)obj).throwEx();
        } catch (Ex1 ex1) {
            System.out.println(ex1.getMessage());
        }
    }

}
