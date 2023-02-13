package model;

import java.util.Date;

public class Employee extends Person{
    private String office;
    private String salary;
    private java.util.Date dateHired;

    public Employee(){
        
    }

    public Employee(String nama, String office, String salary) {
        super(nama);
        this.office = office;
        this.salary = salary;
        this.dateHired = new java.util.Date();

    }
    public String getOffice() {
        return office;
    }
    public void setOffice(String office) {
        this.office = office;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
    public java.util.Date getDateHired() {
        return dateHired;
    }

    @Override
    public String toString() {
        return "Employee [office=" + office + ", salary=" + salary + ", dateHired=" + dateHired + "]";
    }

    
    
}