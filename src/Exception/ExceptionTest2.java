package Exception;

public class ExceptionTest2 {
    public static void main(String[] args) throws Exception{ /**Not Recommend to use this syntax  */

            int x = divide(10, 0);
            System.out.println("The Result of Division of 2 number is = " + x);
            System.out.println("Cant divide by Zero");
    }

    public static int divide(int x, int y) throws Exception {
        if (y == 0) {
            throw new Exception();
        }
        return x / y;
    }
}


