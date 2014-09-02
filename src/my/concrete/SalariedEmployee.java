
package my.concrete;

/**
 * @author Max
 */
public class SalariedEmployee extends Employee {
    
    public double yearlySalary;
    
    public SalariedEmployee (String name, String empID, int age) {
        super(name, empID, age);
    }
    
    public void setYearlySalary (double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }
    
    public double getYearlySalary () {
        return yearlySalary;
    }
}
