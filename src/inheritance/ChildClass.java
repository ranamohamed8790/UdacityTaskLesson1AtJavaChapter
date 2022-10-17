package inheritance;

/**
 * 1. This Sub class will inherit all the method of Parent Class (Class1) and override its value
 * but can't to override the method value of the interface
 * 2. Child class can inherit from more than one Parent class
 * 3. we can do the child class to be abstract if we don't implement the method of interface
 * 4. but if not doing the child class Abstract, so we should  to implement the Method of interface
 */
// public abstract class ChildClass extends Class1 implements Interface1, Interface2
public class ChildClass extends Class1 implements Interface1, Interface2 {
    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }
}
