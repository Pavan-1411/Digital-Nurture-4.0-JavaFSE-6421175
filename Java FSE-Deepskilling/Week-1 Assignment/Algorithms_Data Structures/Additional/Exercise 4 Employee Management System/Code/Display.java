public class Display
{
    public static void display(Employee e)
    {
        if(e!=null)
        {
            System.out.println("Employee ID : "+e.employeeId);
            System.out.println("Employee Name : "+e.name);
            System.out.println("Employee position : "+e.position);
            System.out.println("Employee Salary : "+e.salary);
        }
    }
}