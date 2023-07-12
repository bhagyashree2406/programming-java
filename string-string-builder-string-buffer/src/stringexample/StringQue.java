package stringexample;

public class StringQue {

    public static void main(String[] args) {


        String name1 = "Java";

        /*

        Does not create string object in string pool as this "Java"

        literal already present there

         */

        String name2 = "Java";

        /*

        name3 and name1 are pointing to same string literal "Java"

         */

        String name3 = name1;


        /*

        creates new object in heap and does not create new object

        in string pool as it already present there

         */

        String name4 = new String("Java");

        /*

        creates new object in heap and does not create new object

        in string pool as it already present there

         */

        String name5 = new String("Java");

        String name6 = name1.intern();//creates new string object in SCP if already doesn't exist.

        System.out.println(name1 == name2);//prints true

        System.out.println(name1 == name3);//prints true

        System.out.println(name2 == name3);//prints true


        System.out.println(name1 == name4);//prints false

        System.out.println(name1 == name5);//prints false

        System.out.println(name4 == name5);//prints false

        System.out.println(name1 == name6);//prints true


    }


    }

