package Encapsulation;

public class Student {
    int roll;
    private String name = "Subham";
    private String college;
    public String getName(){
        return name;
    }
    public void setCollege(String college) {
        this.college = college;
    }
    public void getCollege(){
        System.out.println(college);
    }

    public void setRoll(int roll) {
        if (roll >= 0) {
            this.roll = roll;
        }
    }
    public void getRoll(){
        System.out.println(roll);
    }
}
