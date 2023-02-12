package Hashmap;
import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HashMap<Integer , Integer> number=new HashMap<>();
        for(int i=1;i<=15;i++)
        {
            number.put(i, i*i*i);
        }
        System.out.print(number);
    }
}