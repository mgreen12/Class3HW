/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

/**
 *
 * @author Max
 */
public class HourlyEmployee implements Employee{

    private String name;
    private String empID;
    private int age;
    private double hoursWorked;
    private double hourlyPay;
    
    public HourlyEmployee(String name, String empID, int age, double hoursWorked, double hourlyPay) {
        this.name = name;
        this.empID = empID;
        this.age = age;
        this.hoursWorked = hoursWorked;
        this.hourlyPay = hourlyPay;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmpID() {
        return empID;
    }

    @Override
    public int getAge() {
        return age;
    }
    
    public double getPay () {
        if(hoursWorked > 40) {
            return (40 * hourlyPay) + ((hoursWorked - 40) * (hourlyPay * 1.5));
        }
        else return (hoursWorked * hourlyPay);
    }
    
}
