
package myabstract;

/**
 *
 * @author Max
 */
public class SalaryPlusCommissionEmployee extends SalariedEmployee {
    
    private double commission;
    
    public SalaryPlusCommissionEmployee (String name, String empID, int age) {
        super(name, empID, age);
    }
    
    public void setCommission(double commission) {
        this.commission = commission;
    }
    
    public double getPay () {
        return commission + getYearlySalary();
    }
}
