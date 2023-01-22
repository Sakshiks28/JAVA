 import java.util.*;
public class Assi1 {

    public static void main(String[] args)
    {

        int a=1,b=2,c=3,d=4;
        int e=1,f=2,g=3,h=4;
        Scanner s1 =new Scanner(System.in);
        System.out.println("Enter a Student roll no");
        int no=s1.nextInt();
        if(e==no) {
            System.out.println("SAPPHIRE");
        }
        else if(f==no) {
            System.out.println("PEARL");
        }
        else if(g==no) {
            System.out.println("RUBY");
        }
        else if(h==no) {
            System.out.println("EMERALD");
        }
        if(no<=25) {
            while(a<=25) {
                a=a+4;
                if(a==no) {

                    System.out.println("SAPPHIRE");
                }
            }
            while(b<=25) {
                b=b+4;
                if(b==no ) {
                    System.out.println("PEARL");
                }
            }
            while(c<=25) {
                c=c+4;
                if(c==no) {
                    System.out.println("RUBY");
                }
            }
            while(d<=25) {
                d=d+4;
                if(d==no) {

                    System.out.println("EMERALD");
                }
            }

        }
    }

}

