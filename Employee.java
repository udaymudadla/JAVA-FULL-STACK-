class employees{
    int id;
    String name;
    int age;
    int salary;
    void insert( int id,String name,int age,int salary)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    void display(){
        System.out.println(id+" "+ name+" "+age+" "+salary);
    }
}
public class Employee {
    public static void main(String[] args) {
        employees e1 = new employees();
        employees e2 = new employees();
        e1.insert(00,"Harsha",22,3600000);
        e2.insert(01,"Pavan",21,4800000);
        e1.display();
        e2.display();
    }

}
