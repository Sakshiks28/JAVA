import java.util.Scanner;
public class Lstarpattern {
    public static void main (String args[])
    {
        for (int row=1;row<=5;row++)
        {
            for(int col=1;col<=5;col++)
            {
                if (col==1 || row==5)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
