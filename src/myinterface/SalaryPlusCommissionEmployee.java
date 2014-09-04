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
public class SalaryPlusCommissionEmployee implements Employee{

    private String name;
    private String empID;
    private int age;
    private double commission;
    
    public SalaryPlusCommissionEmployee(String name, String empID, int age, double commission) {
        this.name = name;
        this.empID = empID;
        this.age = age;
        this.commission = commission;
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
        return commission;
    }
    
    
}
