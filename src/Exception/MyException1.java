package Exception;

public class MyException1 extends Exception {
    public MyException1() {
        this("MyException1");
    }
    public MyException1(String message) {
        super(message);
    }
}
