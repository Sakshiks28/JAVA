import java.util.*;
public class Product implements Comparable<Product> {

    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {

        if (price == o.price)
            return 0;
        else if (price > o.price)
            return 1;
        else
            return -1;

    }

    public static void main(String[] args) {
        ArrayList<Product> al = new ArrayList<>();
        al.add(new Product("Brush", 50));
        al.add(new Product("Towel", 150));
        al.add(new Product("Nailpaint",100));
        al.add(new Product("Jewellery",200));
        Collections.sort(al);
        for (Product pt : al) {
            System.out.println( pt.name + " " + pt.price);
        }
    }
}