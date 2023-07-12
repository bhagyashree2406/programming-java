package stringexample;
// String is non-primitive data type and creates new string objects which immutable.
/*
There are two ways to create string objects.

1. Using new keywords
It creates two object. One in heap and  one in string constant pool
If string constant pool doesn't contain same string object.
     String name = new String("Bhagyashree");

2. USing string literal
      String name2 = "Asmita";  // "Asmita is string literal
*/

/*
String constant pool
It is part of heap memory that is created by string class when
 this string class is loaded by the classloader,then a part heap memory is reserved for string
 constants and stored into it.
 */


public class StringExamples {

    public static void main(String[] args) {

        String name = new String("Pooja");// this creates new object in SCP and heap both.
        System.out.println(name);

        String name2 = "Priya";// this creates new object in  SCP
        System.out.println(name2);

        name =  name.concat("Pangare");// this creates new object in SCP and heap both.
        System.out.println(name);




    }
}
