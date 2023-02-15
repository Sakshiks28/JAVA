import java.util.*;
public class SimpleInt {
    public static void main(String args[])
    {
        // We can change values here for
        // different inputs
        float P = 1000, R = 5, T = 15;

        /* Calculate simple interest */
        float SI = (P * T * R) / 100;
        System.out.println("Simple interest = " + SI);
    }
}
