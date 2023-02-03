import java.util.*;
public class oddnum {

        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Please enter a  num: ");
            int i = sc.nextInt();
            int i1=sc.nextInt();

            List<Integer> array=new ArrayList();

            array.add(sc.nextInt());
            array.add(sc.nextInt());
            array.add(sc.nextInt());
            array.add(sc.nextInt());
            array.forEach(odd->
            {
                if(odd%2!=0)
                    System.out.println("The Odd Numb is : "+odd);
            });
        }

    }

