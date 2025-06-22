public class Node {
    Task obj;
    Node next;
    Node(){
        this.obj=null;
        this.next=null;
    };
    Node(Task obj)
    {
        this.obj=obj;
        this.next=null;
    }
}
