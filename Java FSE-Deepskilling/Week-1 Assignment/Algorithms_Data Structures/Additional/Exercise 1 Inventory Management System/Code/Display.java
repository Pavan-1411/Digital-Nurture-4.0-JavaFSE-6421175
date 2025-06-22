public class Display {
    public static void display(Product p){
        if(p!=null)
        {
        System.out.println("Product Id : "+p.productId);
        System.out.println("Product Name : "+p.productName);
        System.out.println("Quantity : "+p.quantity);
        System.out.println("Product Price : "+p.price);
        }
    }
}
