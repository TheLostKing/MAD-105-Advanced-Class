package com.company;
enum Position{
    Administration, Production, Sales, Maintenance, Technical, Secretarial
}

public class Employee {
    String employeeFirstName, employeeLastName, startDate;
    int shift, employeeNumber;
    boolean salary;
    double payRate, pay;
    Position position;

    public Employee(String first, String last, Position position, boolean salary, double payRate, int shift, String startDate){
        setName(first, last);
        setShift(shift);
        setPosition(position);
        setSalary(salary);
        setPayRate(payRate);
        setStartDate(startDate);
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

    public Position getPosition() {
        return position;
    }

    public String getStartDate() {
        return startDate;
    }

    public boolean getSalary() {
        return salary;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setSalary(boolean salary) {
        this.salary = salary;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    public double calculate(double hoursIn){
        if(salary){ //calculates pay for salary employees
            pay = payRate*hoursIn;
        }else{ // calculates pay for hourly employees
            if(hoursIn > 40){ //calculates pay with overtime
                pay = payRate*40 + (hoursIn-40)*payRate*1.5;
            }else{
                pay = payRate*hoursIn;
            }
        }

        switch(shift) { //modifies pay based on shift
            case 1:
                pay*= 1;
                break;
            case 2:
                pay *= 1.05;
                break;
            case 3:
                pay *= 1.1;
                break;
            default:
                System.out.println("Someone fucked up here");
                break;
        }
        return pay;
    }

    public String toString(double hoursIn) {
        return "Employee Name: " + getName() + "\nEmployee Shift: " + getShift() + "\nPosition: " + getPosition() + "\nPay Rate: " + getPayRate() + "\nThis Weeks Pay: " + calculate(hoursIn) +"\n";
    }
}
