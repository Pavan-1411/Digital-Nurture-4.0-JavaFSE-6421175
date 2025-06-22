public class Main {
    public static void main(String[] args) {
        Task t1=new Task(1,"t1",true);
        Task t2=new Task(2,"t2",true);
        Task t3=new Task(3,"t3",false);
        Task t4=new Task(4,"t4",false);
        SinglyLinkedList obj=new SinglyLinkedList();
        obj.add(t1); obj.add(t2); obj.add(t3);
        obj.add(t4);
        obj.search(1);
        obj.search(5);
        obj.traverse();
        obj.delete(2);
        obj.traverse();
    }
}
