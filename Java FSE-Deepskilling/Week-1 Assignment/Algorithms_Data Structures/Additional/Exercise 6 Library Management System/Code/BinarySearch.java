public class BinarySearch {
    public static Book binarySearch(int id, Book arr[]){
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid].bookId==id)
                return arr[mid];
            if(arr[mid].bookId<id)
                low = mid+1;
            else
                high = mid-1;
        }
        System.out.println("Book with BookId "+id+" is Not Found");
        return null;
    }
}

