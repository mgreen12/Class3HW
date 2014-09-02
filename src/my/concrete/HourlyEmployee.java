
package my.concrete;

/**
 * @author Max
 */
public class HourlyEmployee extends Employee {
    
    private double hoursWorked;
    private double hourlyPay;
    
    public HourlyEmployee (String name, String empID, int age) {
        super(name, empID, age);
    }
    
    public void setHoursAndPay (double hoursWorked, double hourlyPay) {
        this.hoursWorked = hoursWorked;
        this.hourlyPay = hourlyPay;
    }
    
    public double getHoursWorked () {
        return hoursWorked;
    }
    
}
