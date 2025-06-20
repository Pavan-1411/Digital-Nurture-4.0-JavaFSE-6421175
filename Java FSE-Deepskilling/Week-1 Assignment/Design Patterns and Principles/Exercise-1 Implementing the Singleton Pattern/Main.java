import Logger.Logger;

public class Main {
    public static void main(String[] args) {
        Logger obj1=Logger.getInstance();
        System.out.println(obj1.hashCode());
        Logger obj2=Logger.getInstance();
        System.out.println(obj2.hashCode());
        System.out.println(obj1.equals(obj2));
    }
}
