package mypackage;

public class Exception {
    public static void main(String[] args) {
            try {
                devide(10, 2);
            } catch (ArithmeticException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Finally");
            }
        }


    public static void devide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot devide by zero!");
        } else {
            System.out.println("Result is: " + a / b);

        }
    }
}

