public class Main {
    public static void main(String[] args) {
        Book arr[]=new Book[5];
        arr[0] = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald");
        arr[1] = new Book(4, "1984", "George Orwell");
        arr[2] = new Book(2, "To Kill a Mockingbird", "Harper Lee");
        arr[3] = new Book(0, "Pride and Prejudice", "Jane Austen");
        arr[4] = new Book(13, "The Hobbit", "J.R.R. Tolkien");

        //using Linear Search
        int searchedBookid =4;
        Book searchedBook1 = LinearSearch.linearSearch(searchedBookid, arr);
        Display.displayBook(searchedBook1);
        System.out.println();
        //using BinarySearch
        Sort obj = new Sort();
        Book sortedList[] = obj.sort(arr);
        Book searchedBook2 = BinarySearch.binarySearch(searchedBookid, sortedList);
        Display.displayBook(searchedBook2);
    }
}
