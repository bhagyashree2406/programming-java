/*
Class is a user defined data types OR Non-primitive Data Type
It is a blueprint for the  objects

  class Student-> User defined data type non-primitive data type
  This class Student can have multiple objects eg. bhagyashree,prashant ...etc

#Student Properties OR Fields
     name - String
     age - int
     div -char
     id - int
     collegeName - String

#Student Behaviour \ Action
     study()
     play()
     commute()
 */

public class Student {
   // Properties or Fields or Attributes //
    String name;
    int age;
    char div;
    int id;
    String collegeName;

   // Methods OR Behaviour OR Actions //

    void study()
    {
        System.out.println(this.name + " is studying");
    }
     void  play(){
         System.out.println(this.name + "is playing");
     }
     void commute(){

        System.out.println(this.name + "is commute");
     }
}

class Example{
    public static void main(String[] args) {
         // Objects is a entity of class //
        Student bhagyashree = new Student();
               /*

               new keyword creates an object in heap
               bhagyashree is reference variable for the object created
              Student() is no -argument  constructor call

                */
         //fields for bhagyashree
        bhagyashree.name = "Bhagyashree";
        bhagyashree.age = 23;
        bhagyashree.id = 101;
        bhagyashree.div = 'A';
        bhagyashree.collegeName = "Yashwantrao Chavan Collage Of Science Karad";
         //Methods for bhagyashree
        bhagyashree.commute();
        bhagyashree.study();
        bhagyashree.play();

        Student prashant = new Student();
        prashant.name = "Prashant";
        prashant.age = 25;
        prashant.id = 102;
        prashant.div = 'B';
        prashant.collegeName = "Navsayadri COE";

        prashant.commute();
        prashant.play();



    }
}
