import java.util.Scanner;
public class NumPattern {
    public static void main(String args[])
    {
        int r = 1, c = 1, n = 5;
        // the while loop check the conditions until the
        // condition is false. if it is true then enter in
        // to loop and execute the statements
        while (r <= n) {
            while (c <= r ) {
                // printing the required pattern
                System.out.print(c+" ");
                c++;
            }
            r++;
            c = 1;
            // new line after each row
            System.out.println();
        }
    }
}

