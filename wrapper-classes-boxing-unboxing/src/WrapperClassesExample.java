public class WrapperClassesExample {
    /*
    Primitive Data Types
    1. byte - Byte
    2. short - Short
    3.int - Integer - 4 bytes - 32 bit  - min value  = -2^ 31  and max value 2^ 31-1
    4. long - Long
    5. char - Character
    6. boolean - Boolean
    7. float - Float - 4 byte - 32 bits -
    8. double -Double
     */
    public static void main(String[] args) {
        int x= 10;
        System.out.println("x : " + x);
        Integer y = x;
        System.out.println("y : " + y);
        System.out.println("Integer.MIN_VALUE : " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE  : " + Integer.MAX_VALUE);


        float f1 =  10.0f;
        System.out.println("f1 : " + f1);
        Float f2 = f1; // automatic converts from float (primitive) to  Float (primitive wrapper )
        // autoboxing
        System.out.println("f2 : " + f2);
        System.out.println("Float.MIN_VALUE : " + Float.MIN_VALUE );
        System.out.println("Float.MAX_VALUE : " + Float.MAX_VALUE);
        f1 =f2 ; // autoUnboxing  --> automatic converts from float (primitive) to  Float (primitive wrapper )
        System.out.println("F1 : " + f1);
        System.out.println("f2 : " + f2);



    }
}
