import java.util.Scanner;
public class Weird {

    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String ans="";
        if(a%2==1 || ( (a%2==0) && (a>=6 && a <= 20 ) )){
            ans = "Weird";
        } else {
            ans = "Not Weird";
        }
        System.out.print("The number is: ");
        System.out.println(ans);

    }
}
