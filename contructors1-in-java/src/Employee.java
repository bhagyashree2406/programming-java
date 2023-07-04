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

    // Constructor Chaining
     // 49 -> 56 -> 61

    Employee(String name,int id,int salary){
        // calling a constructor with gender and company as params
        this("Female","TCL");// Constructor chaining
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    Employee(String gender,String company){
        this("Mumbai",90909090900l);// Constructor chaining
        this.gender = gender;
        this.company = company;
    }
    Employee(String address,long phoneNo){
        this.address = address;
        this.phoneNo = phoneNo;
    }
    Employee(long phoneNo,String address){
        this.phoneNo = phoneNo;
        this.address = address;
    }

    // Copy Constructor - Copy fields from one object to another object

    Employee(Employee employee){
        // 'this' here will refer employee6 as this cnstructor is clled by employee6
        this.name = employee.name;
        this.id = employee.id;
        this.salary = employee.salary;
        this.gender = employee.gender;
        this.address = employee.address;
        this.phoneNo = employee.phoneNo;

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

        Employee employee6 =new Employee(employee5);
        employee6.displayObjectAndMessge();

        Employee employee7 = new Employee("Asmita",106,50000);
        employee7.displayObjectAndMessge();

    }
}


