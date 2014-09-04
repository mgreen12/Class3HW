
package myabstract;

/**
 *
 * @author Max
 */
public abstract class Employee {
    String name;
    String empID;
    int age;
    
    public Employee(String name, String empID, int age){
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
