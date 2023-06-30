public class DataTypesExample {

    public static void main(String[] args) {

        /*  Data Types
              1. Primitive
                 Type   &     Size
              1. byte   -   1 Byte  --> -2^7 to +(2^7-1) = -128 to 127
              2. short  -   2 Byte  --> -2^15 to +(2^15-1) = -32768 to 32767
              3. char   -   2 Byte  --> -2^15 to +(2^15-1) = -32768 to 32767
              4. int    -   4 Byte  --> -2^31 to +(2^31-1) = -2147483648  to 2147483647
              5. float  -   4 Byte  -->-2^31 to +(2^31-1) = -2147483648  to 2147483647    --->single precision -->Floating Point num
              6. long   -   8 Byte  --> -2^63 to +(2^63-1) =
              7. double -   8 Byte  -->-2^63 to +(2^63-1) =                              --->double precision -->Floating point num
              8. boolean-   8 bit   --> true or false -> 0 or 1


              2. Non-Primitive
                  Class & Arrays

         */


        byte byteData = (byte)128; // byte is data type & single byte is variable name & 10 is value of variable.
        System.out.println("byte : "+byteData);
        System.out.println("byte Min : "+Byte.MIN_VALUE);
        System.out.println("byte Max : "+Byte.MAX_VALUE);

        short shortData = (short)32768;
        System.out.println("short : "+shortData);
        System.out.println("short Min : "+Short.MIN_VALUE);
        System.out.println("short : "+Short.MAX_VALUE);

        char charData ='A';
        System.out.println("char : "+charData);
        System.out.println("char Min : "+Character.MIN_VALUE);
        System.out.println("char Max : "+Character.MIN_VALUE);

        int intData = 200000;
        System.out.println("int : "+intData);
        System.out.println("int Min : "+Integer.MIN_VALUE);
        System.out.println("int Max : "+Integer.MAX_VALUE);

        float floatData =  10.1212121212125f ;
        System.out.println("float : "+floatData);
        System.out.println("float Min : "+Float.MIN_VALUE);
        System.out.println("float Max : "+Float.MAX_VALUE);


        double doubleData = 10.12121212121212121212125d;
        System.out.println("double : "+doubleData);
        System.out.println("double Min : "+Double.MIN_VALUE);
        System.out.println("double Max : "+Double.MAX_VALUE);


        long longData = 2000000000l;
        System.out.println("long : "+longData);
        System.out.println("long Min : "+Long.MAX_VALUE);
        System.out.println("long Max : "+Long.MIN_VALUE);



        boolean booleanData = true;
        System.out.println(booleanData);

    }

}
