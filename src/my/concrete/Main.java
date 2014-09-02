
package my.concrete;

/**
 * @author Max
 */
public class Main {
    
    public static void main(String[] args) {
        
        HourlyEmployee employee1 = new HourlyEmployee("Jeff", "112233", 20);
        employee1.setHoursWorked(42);
        employee1.setHourlyPay(8.00);
        
        System.out.println(employee1.getName() + " worked " + employee1.getHoursWorked() + " hours at $" + employee1.getHourlyPay() + "/hour\n$" + employee1.getPay() + " earned for the week");
        
    }
    
}
