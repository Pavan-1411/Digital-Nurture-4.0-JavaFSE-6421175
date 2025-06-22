public class LinearSearch {
    public static Book linearSearch(int id, Book arr[]){
        for(Book book: arr){
            if(book.bookId==id)
                return book;
        }
        System.out.println("Book with BookId "+id+" is Not Found");
        return null;
    }
}

