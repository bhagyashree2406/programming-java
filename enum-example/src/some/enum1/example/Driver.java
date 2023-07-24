package some.enum1.example;

public class Driver {
    public static void main(String[] args) {
     for (Direction direction : Direction.values()){
         System.out.println(direction.msg);
     }
    }
}
