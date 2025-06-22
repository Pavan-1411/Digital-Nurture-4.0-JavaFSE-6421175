public class Display {
   public static void display(Order a[]){
        System.out.println("Id"+"      "+"CustomerName"+"      "+"TotalPrice");
        for(int i=0; i<a.length; i++){
            System.out.println(a[i].orderId+"       "+a[i].customerName+"         "+a[i].totalprice);
        }
    }
}
