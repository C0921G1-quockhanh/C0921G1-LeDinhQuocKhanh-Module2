package ss15_debug_exception_java.bai_tap.bai1;

public class SumSideException extends Exception{
    public SumSideException() {
        super("The sum of any two sides is greater than the other side!");
    }
}
