public class Main
{
    public static void main(String[] args) {

        Product p1 = new Product(1, "Mobile Phone", 30, 15000.0);
        Product p2 = new Product(2, "Sports Shoes", 50, 3000.0);
        Product p3 = new Product(3, "Laptop", 20, 40000.0);
        Product p4 = new Product(4, "Shirt", 100, 800.0);
        Product p5 = new Product(5, "TV", 10, 25000.0);

        System.out.println();

        ProductMethods.updateProduct(3, "Laptop Basic", 25, 38000.0);
        ProductMethods.updateProduct(4, "Cotton Shirt", 120, 850.0);
        
        Product d1= ProductMethods.geProduct(2);
        Display.display(d1);
        Product d2=ProductMethods.geProduct(7);
        Display.display(d2);
    }
}