public class Task {
    int taskId;
    String taskName;
    boolean status;
    Task()
    {

    }
    Task(int taskId,String taskName,boolean status)
    {
        this.taskId=taskId;
        this.taskName=taskName;
        this.status=status;
        // SinglyLinkedList.add(this);
    }
}
