package ss15_debug_exception_java.bai_tap.bai1;

public class SideException extends Exception{
    public SideException() {
        super("The side of triangle is greater than zero!");
    }
}
