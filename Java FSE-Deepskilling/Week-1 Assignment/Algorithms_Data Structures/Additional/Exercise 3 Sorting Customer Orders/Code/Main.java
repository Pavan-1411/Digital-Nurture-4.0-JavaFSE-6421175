public class Main
{
    public static void main(String[] args) {
        Order arr[] = new Order[6];
        arr[0] = new Order("ORD001", "Aarav   ", 7500.0);
        arr[1] = new Order("ORD002", "Bhavya  ", 3200.0);
        arr[2] = new Order("ORD003", "Chirag  ", 1500.0);
        arr[3] = new Order("ORD004", "Diya    ", 8900.0);
        arr[4] = new Order("ORD005", "Eshan   ", 2450.0);
        arr[5] = new Order("ORD006", "Farhan  ", 6100.0);

        // Using BubbleSort
        BubbleSort BSort = new BubbleSort();
        BSort.sortItems(arr);
        Display.display(arr);
        System.out.println();
        // Using QuickSort
        QuickSort QSort = new QuickSort();
        QSort.sortItems(arr);
        Display.display(arr);
    }
}