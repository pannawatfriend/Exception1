package Exception1;

import java.nio.channels.AcceptPendingException;

public class LAB3 {
    public static void main(String[] args) {

        try {
            System.out.println("statement1");
            System.out.println(1/0);
            System.out.println("statement3");

        }
        catch (ArithmeticException e){

        }
        finally {
            System.out.println("statement4");
        }
        System.out.println("statement5");
    }
}
