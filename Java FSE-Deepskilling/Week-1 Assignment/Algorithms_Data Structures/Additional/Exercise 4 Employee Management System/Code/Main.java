public class Main {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.add(1,"Kalyan","HR        ",1000000);
        e.add(2,"Mahesh","Programmer",50000);
        e.add(3,"Charan","Manager   ",75000);
        e.add(4,"Sharma","Programmer",60000);
        Display.display(e.search(4));
        Display.display(e.search(9));
        e.traverse();
        e.delete(4);
        e.delete(8);
        e.traverse();
    }
}
