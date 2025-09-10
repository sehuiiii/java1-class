package throw1;

class MyException extends Exception {
    public MyException() {
        super();
    }
    public MyException(String message) {
        super(message);
    }
}

class MyRTException extends RuntimeException {
    public MyRTException(String message) {
        super(message);
    }

    public MyRTException() {
        super();
    }
}

class A1 {
    MyException me1 = new MyException();
    MyException me2 = new MyException("예외 메시지: MyException");

    MyRTException mre1 = new MyRTException();
    MyRTException mre2 = new MyRTException("예외 메시지: MyRTException");

    void abc_1(int num) {
        try {
            if (num > 70) System.out.println("정상작동");
            else throw me1;
        } catch (MyException e) {
            System.out.println("예외처리 1");
        }
    }

    void bcd_1() {
        abc_1(65);
    }

    void cde_1() {
        throw mre1;
    }

    void abs_2(int num) throws MyException {
        if (num > 70) System.out.println("정상작동");
        else throw me1;
    }

    void bcd_2() {
        try {
            abs_2(65);
        } catch (MyException e) {
            System.out.println("예외처리 2");
        }
    }
}

public class CreateUserException {
    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.bcd_1();
        a1.bcd_2();
    }
}
