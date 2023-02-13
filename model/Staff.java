package model;

public class Staff extends Employee {
    private String title;

    public Staff(){
        
    }

    public Staff(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Staff [title=" + title + "]";
    }
    
}
