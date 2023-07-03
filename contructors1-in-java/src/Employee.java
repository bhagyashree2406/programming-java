public class Employee {
    // Attributes or fields
   String name;
    int id;
    String address;
    long phoneNo;
    int salary;
    String gender;
    String company;

    //Constructor ----Constructors constuct the objects, basically initialized object.
    /*
    1. Constructor name must be same as class name.
    2. Constructor Does not have any return type.
    3. Constructors can have parameters.
    4. Constructors does not return any value.
      */

    // No Argument Constructor
    Employee(){
        System.out.println("****************************");
        System.out.println("no argument constructor called");
        this.name = "Bhagyashree";
        this.id = 101;
        this.salary = 20000;
        this.gender =  "female";
        this.company ="Tata Communication Ltd";
        this.address = "pune";
        this.phoneNo =  9890040410l;
        System.out.println("*****************************");
    }
    // parameterized constructor
    Employee(String name,int id,int salary,String gender,String company,String address,long phoneNo){
        System.out.println("*********************************");
        System.out.println("parameterized constructor called");
        this.name = name;
        this.id = id;  // right side variable is parameter and left side  variable is field
        this.salary = salary;
        this.gender = gender;
        this.company = company;
        this.address = address;
        this. phoneNo = phoneNo;
        System.out.println("***********************************");
    }
    void displayObjectAndMessge(){
        System.out.println("Hello " + this.name);
        System.out.println(this.id + "\n" + this.salary+"\n" +this.gender+"\n" +this.company+ "\n" + this.address+"\n" + this.phoneNo);
    }
}

class  TestClass{
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.displayObjectAndMessge();

        Employee employee2 = new Employee();
        employee2.displayObjectAndMessge();

        Employee employee3 = new Employee();
        employee3 .displayObjectAndMessge();

        Employee employee4 = new Employee("Prashant", 102,90000,"Male","TCL","Karad",9762132283l);
        //employee 4 = 4000h
        employee4.displayObjectAndMessge();

        Employee employee5 = new Employee("Prashree", 103,40000,"Female","MS","Delhi",9022665217l);
        //employee 5 = 5000h
        employee5.displayObjectAndMessge();



    }
}

