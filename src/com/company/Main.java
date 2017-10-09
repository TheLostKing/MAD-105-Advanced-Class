package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Employee employee1 = new Employee("Zac", "Calderone", Position.Secretarial, false, 30, 3, "10/03/2003");
        Employee employee2 = new Employee("Arthas", "Menethil", Position.Maintenance, true, 25, 1, "08/10/2001");
        Employee employee3 = new Employee("John", "Shepard", Position.Sales, true, 28, 2, "07/14/2015");

        System.out.println(employee1.toString(40));
        System.out.println(employee2.toString(55));
        System.out.println(employee3.toString(60));
    }
}
