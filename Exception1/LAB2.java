package Exception1;

import java.lang.IndexOutOfBoundsException;

public class LAB2 {
    public static void main(String[] args) {
        int[] list = new int[10];
        try {

//            System.out.println( list[10]);
            throw new Exception();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }
        catch (RuntimeException e) {
            System.out.println("Runtime Exception");
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
