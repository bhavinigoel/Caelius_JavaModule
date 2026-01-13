public class Main
{

class Employee{
    void work(){
        System.out.println("Employee is Working");
    }
}

class Manager extends Employee{
    void approveLeave(){
        System.out.println("Leave Approved by the Manager");
        
    }
    
}

public static void main(string[] args){
    Manager m =new Manager();
    m.work();
    m.approveLeave();
}
    



}
