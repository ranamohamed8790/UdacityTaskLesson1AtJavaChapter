package Exception;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            //Open Connection
            int x = divide(10, -1);
            System.out.println("The Result of Division of 2 number is = " + x);
        } catch (MyException1 e1) {
            System.out.println("MyException1");
            e1.printStackTrace();
        } catch (MyException2 e2) {
            System.out.println("MyException2");
            e2.printStackTrace();
        } catch (Exception exp) {
            System.out.println("Cant divide by Zero");
            exp.printStackTrace();
            // exp.getMessage(); // to get the message of Exception
        }finally {

        }

    }

    public static int divide(int x, int y) throws Exception {
        if (y == 0) {
            throw new Exception("divide by zero error");
        }
        if (y == 1) {
            throw new MyException1();
        }
        if (y == -1) {
            throw new MyException2();
        }
        return x / y;
    }
}
