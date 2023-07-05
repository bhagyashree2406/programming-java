package driver;

import entities.Address;
import entities.College;
import entities.Employee;
import entities.Student;

public class Driver {
    private static College college;
    private static String College;

    public static void main(String[] args) {
        Address address = new Address() ;
        address.setFlatNum("A120");
        address.setLineNum("Karad Road");
        address.setDistrict("Karad");
        address.setTaluka("satara");
        address.setState("MH");


        College  college = new College();
        college.setName("SGM Karad");
        college.setNoOfStaff(100);
        college.setNoOfStudent(200);


        Employee employee = new Employee();
        employee.setName("Raju");
        employee.setAge(50);
        employee.setCollege("College");


        Student student = new Student();
        student.setName("Mahesh");
        student.setAddress(address);
        student.setId(400);
        student.setCollegeName(College);



        System.out.println(address.toString());
        System.out.println(college.toString());
        System.out.println(employee.toString());
        System.out.println(student.toString());
    }
}
