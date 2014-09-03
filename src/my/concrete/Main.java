
package my.concrete;

/**
 * @author Max
 */
public class Main {
    
    public static void main(String[] args) {
        
        HourlyEmployee employee1 = new HourlyEmployee("John", "112233", 40);
        employee1.setHoursAndPay(42, 8.00);
        System.out.println(employee1.getHoursWorked() + " hours \n$" + employee1.getHourlyPay() + " per hour\n$" + employee1.getPay() + " earned");
        
        HourlyEmployee employee2 = new HourlyEmployee("Jeff", "111222", 30);
        employee1.setHoursAndPay(35, 10.00);
        System.out.println(employee1.getHoursWorked() + " hours \n$" + employee1.getHourlyPay() + " per hour\n$" + employee1.getPay() + " earned");
    }
    
}
