public class Display {
    public static void displayProduct(Product obj){
        if(obj!=null){
            System.out.println("Product Id: "+obj.productId);
            System.out.println("Product Name: "+obj.productName);
            System.out.println("Category: "+obj.category);
        }
        else
            System.out.println("No Product Found");
    }
}
