
package my.concrete;

/**
 * @author Max
 */
public class Employee {
    String name;
    String empID;
    int age;
    
    public Employee() {
        
    }
    
    public Employee(String name, String empID, int yearsEmployed){
        this.name = name;
        this.empID = empID;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmpID() {
        return empID;
    }
    
    public int getAge() {
        return age;
    }
 
}
