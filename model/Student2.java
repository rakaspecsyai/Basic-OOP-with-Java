package model;

public class Student2 extends Person{
    private final String status;

    public Student2(String nama, int sts) {
        super(nama);
        switch (sts) {
            case 0:
                status = "freshman";
                break;
            case 1:
                status = "sophomore";
                break;
            case 2:
                status = "junior";
                break;
            case 3:
                status = "senior";
                break;

            default:
                status = "";
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " " + super.getName() + " Student2";
    }

    public String getStatus() {
        return status;
    }

    
}
