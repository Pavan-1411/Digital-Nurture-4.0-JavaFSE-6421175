import Documents.DocumentFactory;
import Factory.Factory;

public class Main {
    public static void main(String[] args) {
        String type="pdf";
        DocumentFactory obj=Factory.getInstance(type);
        obj.CreateDocument();
    }
}
