public class SinglyLinkedList implements LinkedList{
    public static Node head=new Node(new Task(-1,"",true));
    SinglyLinkedList()
    {
    }
    public void add(Task obj)
    {
       Node temp=head;
       Node nn=new Node(obj);
       while(temp.next!=null)
       {
        temp=temp.next;
       }
       temp.next=nn;
    }
    public void search(int taskId)
    {
        Node temp=head.next;
        while(temp!=null)
        {
          if(temp.obj.taskId==taskId)
          {
            System.out.println("Task with TaskId: "+taskId+" is Found");
            Display.display(temp.obj);
            return ;
          }
          temp=temp.next;
        }
        System.out.println("Task with TaskId: "+taskId+" id Not Found");
        return ;
    }
    public void traverse()
    {
       Node temp=head.next;
       if(temp==null)
       {
        System.out.println("No Tasks");
        return;
       }
       System.out.println("ID                Name                Status");
       while(temp!=null)
       {
         System.out.println(temp.obj.taskId+"                "+temp.obj.taskName+"                "+temp.obj.status);
         temp=temp.next;
       }
    }
    public void delete(int taskId)
    {
        Node temp = head;
        while(temp.next!=null){
            if(temp.next.obj.taskId==taskId){
                temp.next = temp.next.next;
                System.out.println("Task with id "+taskId+" deleted successfully...");
            }
            temp = temp.next;
        }
        System.out.println("No task found with Id "+taskId);

    }
}
