public class Display {
    public static void displayBook(Book obj){
        if(obj!=null){
            System.out.println("Book Id: "+obj.bookId);
            System.out.println("Book Title: "+obj.title);
            System.out.println("Author:: "+obj.author);
        }
    }
}