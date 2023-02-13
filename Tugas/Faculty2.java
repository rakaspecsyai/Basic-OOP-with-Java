package model;

public class Faculty2 extends Employee {
    private String rank;
    private String officeHour;

    

    public Faculty2(String nama, String rank, String officeHour) {
        super(nama);
        this.rank = rank;
        this.officeHour = officeHour;
    }
    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    public String getOfficeHour() {
        return officeHour;
    }
    public void setOfficeHour(String officeHour) {
        this.officeHour = officeHour;
    }

    
}
