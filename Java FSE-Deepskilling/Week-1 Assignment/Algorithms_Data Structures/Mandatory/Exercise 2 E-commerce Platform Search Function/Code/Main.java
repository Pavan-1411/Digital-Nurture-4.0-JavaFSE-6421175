public class Main
{
    public static void main(String[] args) {
        Product arr[] = new Product[5];
        arr[0] = new Product(2, "Mobile", "Electronics");
        arr[1] = new Product(1, "Sugar", "Grocery");
        arr[2] = new Product(0, "Wheat", "Grocery");
        arr[3] = new Product(4, "Mixer", "Electronics");
        arr[4] = new Product(3, "Shirt", "Clothing");

        int searchedProductid =2 ;
        //using LinearSearch[O(n)]
        Product searchedProduct1 = LinearSearch.linearSearch(searchedProductid, arr);
        Display.displayProduct(searchedProduct1);
        System.out.println();
        //using BinarySearch[O(logn)]
        Sort obj = new Sort();
        Product sortedList[] = obj.sort(arr);
        Product searchedProduct2 = BinarySearch.binarySearch(searchedProductid, sortedList);
        Display.displayProduct(searchedProduct2);
    }
}