class students 
{
    int id ;
    String name;
    String branch;
    }
    public class student 
     {
     public static void main(String[] args) {
        students s1 = new students();
        s1.id = 1;
        s1.name = "Rahul";
        s1.branch = "CSE";
        students s2 = new students();
        s2.id= 2;
        s2.name = "kiran";
        s2.branch="MECH";
        System.out.println(s1.id+" "+s1.name+ " "+s1.branch);
        System.out.println(s2.id+" "+s2.name+ " "+ s2.branch);
    }
    }

