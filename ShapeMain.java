class Shape
{
    double area;
    void getArea()
    {
        System.out.println("Area = " + area);
    }

}
class Circle extends Shape
{
    int r = 4;
    void getShape()
    {
        area = 3.14*r*r;
    }
//    void getArea()
//    {
//        System.out.println("Area of circle = " + area);
//    }
}
class Square extends Shape
{
    int side = 5;
    void getShape()
    {
        area = side*side;
    }
//    void getArea()
//    {
//        System.out.println("Area of square = " + area);
//    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Circle ob = new Circle();
        ob.getShape();
        ob.getArea();

        Square ob1 = new Square();
        ob1.getShape();
        ob1.getArea();
    }
}
