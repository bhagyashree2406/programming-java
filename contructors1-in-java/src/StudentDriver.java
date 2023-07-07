public class StudentDriver {

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student("Bunty",1000);
        Student student3 = new Student("Rohini",2000,100,300,'A', "COE");

        System.out.println(student1.toString());

        System.out.println(student2.toString());

        System.out.println(student3.toString());

    }
}
