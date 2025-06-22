import java.util.HashMap;

public class ProductMethods {
    public static HashMap<Integer, Product> ProductStore = new HashMap<>();
    public static void addProduct(Product p){
        ProductStore.put(p.productId, p);
        System.out.println("Product added Successfully.");
    }
    public static Product geProduct(int productId){
        if(!ProductStore.containsKey(productId)){
            System.out.println("Product with ID: " + productId+" Not Found");
            return null;
        }
        System.out.println("Product with ID: " + productId+" is Found");
        return ProductStore.get(productId);
    }
    public static void updateProduct(int productId, String newName, int newQuantity, double newPrice) {
    if (ProductStore.containsKey(productId)) {
        Product p = ProductStore.get(productId);
        p.setProductName(newName);
        p.setQuantity(newQuantity);
        p.setPrice(newPrice);
        System.out.println("Product Details Of ProductId "+productId+" updated successfully.");
    } else {
        System.out.println("Product with ID: " + productId+" Not Found");
    }
}
}
