package com.company;

public class Employee {
    String employeeFirstName, employeeLastName;
    int shift, employeeNumber;

    public Employee(String first, String last, int shift, int num){
        setName(first, last);
        setShift(shift);
        setEmployeeNumber(num);
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public void setName(String employeeFirstName, String employeeLastName){
        setEmployeeFirstName(employeeFirstName);
        setEmployeeLastName(employeeLastName);
    }

    public String getName(){
        return "" + getEmployeeFirstName() + " " + getEmployeeLastName();
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public String toString() {
        return "Employee Name: " + getName() + "\nEmployee Number: " + getEmployeeNumber() + "\nEmployee Shift: " + getShift() + "\n";
    }
}
