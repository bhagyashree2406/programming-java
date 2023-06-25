public class Student {
    String name;
    int age;
    char div;
    int id;
    String collegeName;



    void study(){
        System.out.println(this.name + " is studying");

    }

    void  play(){
        System.out.println(this.name + " is playing");

    }

    void commute(){
        System.out.println(this.name + "is commuting");

    }

}

class  Example{
    public static void main(String[] args) {
        Student Bhagyashree = new Student();
        Bhagyashree.name = "Bhagyashree";
        Bhagyashree.age = 22;
        Bhagyashree.id = 101;
        Bhagyashree.div = 'A';
        Bhagyashree.collegeName = "SGM Clg Karad";

        Bhagyashree.commute();
        Bhagyashree.play();
        Bhagyashree.study();

        Student Prashant = new Student();
        Prashant.name= "Prashant";
        Prashant.age = 25;
        Prashant.id = 102;
        Prashant.div = 'B';
        Prashant.collegeName = " Yashwantraw Clg karad";


        Prashant.commute();
        Prashant.play();
        Prashant.study();

    }
}
