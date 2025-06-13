class Person {
    void getfirstame()
    {
        System.out.println("Dhiraj");
    }
    void getlastname()
    {
        System.out.println("Kumar");
    }
}
class Employee extends Person {
    @Override
    void getlastname(){
        System.out.println("kumar (senior analyst)");
    }
    void getemployeeid(){
        System.out.println("15785");
    }
}
public class Main {
    public static void main(String[] args){
        Employee e=new Employee();
        e.getfirstname();
        e.getlastname();
        e.getemployeeid();
    }
}