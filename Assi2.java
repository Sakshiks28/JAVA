import java.util.Scanner;

public class Assi2 {

    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s1.nextInt();

        for(int i=1;i<=n;i++) {
            for(int j=i;j<=n-1;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            for(int j=i-1;j>=1;j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}