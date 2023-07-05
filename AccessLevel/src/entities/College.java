package entities;

public class College {
    String name;
    int noOfStaff;
    int noOfStudent;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public College() {
    }

    public int getNoOfStaff() {
        return noOfStaff;
    }

    public void setNoOfStaff(int noOfStaff) {
        this.noOfStaff = noOfStaff;
    }

    public int getNoOfStudent() {
        return noOfStudent;
    }

    public void setNoOfStudent(int noOfStudent) {
        this.noOfStudent = noOfStudent;
    }

    @Override
    public String toString() {
        return "College{" +
                "name='" + name + '\'' +
                ", noOfStaff=" + noOfStaff +
                ", noOfStudent=" + noOfStudent +
                '}';
    }
}
