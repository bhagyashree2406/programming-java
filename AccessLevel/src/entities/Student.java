package entities;

public class Student {
    String name;
    String collegeName;
    int id;
    Address address;

    public Student() {
    }

    public Student(String name, String collegeName, int id, Address address) {
        this.name = name;
        this.collegeName = collegeName;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = this.address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", id=" + id +
                ", address=" + address +
                '}';
    }

    public void setAddress(String umbraj) {
    }
}
