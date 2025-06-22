class Employee
{
    static final int maxNoOfEmployee=5;
    public static Employee[] arr=new Employee[maxNoOfEmployee];
    int employeeId;
    String name;
    String position;
    double salary;
    public static int k=0;
    Employee()
    {
    }
    void add(int employeeId,String name,String position,double salary)
    {
        Employee e1=new Employee();
        e1.employeeId=employeeId;
        e1.name=name;
        e1.position=position;
        e1.salary=salary;
        arr[k++]=e1;
    }
    int searchEmployee(int employeeId)
    {
        int idx=0;
        while(idx<arr.length&&arr[idx]!=null)
        {
            if(arr[idx].employeeId==employeeId)
            {
                return idx;
            }
            else
            idx++;
        }
        return -1;
    }
    Employee search(int employeeId)
    {
       int index=searchEmployee(employeeId);
       if(index==-1)
       {
       System.out.println("Employee with EmployeeID: "+employeeId+" is not Found");
       return null;
       }
       System.out.println("Employee with EmployeeID: "+employeeId+" is Found");
       return arr[index]; 
    }
    void traverse()
    {
        if(arr[0]==null)
        {
            System.out.println("No Employees are present");
            return;
        }
        System.out.println("ID                Name                Position                Salary");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=null)
            {
                 System.out.println(arr[i].employeeId+"                "+arr[i].name+"                "+arr[i].position+"                "+arr[i].salary);
            }
            else
            break;
        }
    }
    void delete(int employeeId)
    {
        int index=searchEmployee(employeeId);
        if(index==-1)
        {
            System.out.println("Employee with EmployeeId: "+employeeId+" Not Found");
            return;
        }
        if(index!=-1)
        {
            System.out.println("Employee with EmployeeId: "+employeeId+" Deleted Successfully");
            arr[index]=null;
            while(index<arr.length&&arr[index]!=null)
            {
                arr[index]=arr[index+1];
                index++;
            }
            arr[index]=null;
            k--;
        }
    }
}