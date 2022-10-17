package Exception;

public class MyException2 extends RuntimeException {
    public MyException2() {
        this("MyException2");
    }
    public MyException2(String message) {
        super(message);
    }
}
