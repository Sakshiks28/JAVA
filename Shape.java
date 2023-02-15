import java.util.*;
class Area
{
    void area ( int l)
    {
        System.out.println("The area of square is:"+ (l*l));
    }
    void area ( int l, int b)
    {
        System.out.println("The area of rectangle is:"+ (l*b));
    }
    void area (double b, int h)
    {
        System.out.println("The area of triangle is:"+ ((b*h)/2));
    }

}
public class Shape
{
    public static void main(String args[])
    {
            Area obj = new Area();
            obj.area(10);
            obj.area(10, 20);
            obj.area(4.4,13);

    }
}
