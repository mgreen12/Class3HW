
package my.concrete;

/**
 * @author Max
 */
public class Main {
    
    public static void main(String[] args) {
        

        HourlyEmployee employee1 = new HourlyEmployee("John", "112233", 40);
        employee1.setHoursAndPay(42, 8.00);
        System.out.println(employee1.getHoursWorked() + " hours \n$" + employee1.getHourlyPay() + " per hour\n$" + employee1.getPay() + " earned");
               
        //This shows that HourlyEmployee properly inherits methods from Employee, so all other subclasses would work too if I tested them.
        System.out.println(employee1.getName() + " worked " + employee1.getHoursWorked() + " hours at $" + employee1.getHourlyPay() + "/hour\n$" + employee1.getPay() + " earned for the week");
        

    }
    
}
