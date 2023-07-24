package some.enum1.example;
// ENUM is set of predefined constants.
// eg . Direction is an enum of predefined  constants.

// enum is very similar to class.
// enum can have fields.
// It can also have constructor and methods.
//Each enum constants is by default , public, static final of type enum.
// Each enum constant is written in capital letters.
// Enum is basically a class
//But only difference is its objects are pre created at the time of enum loading.
// Static variables and blocks are initialized and executed when class is loaded into memory by created

public enum Direction {

    // Set Of enum constants,this are basically enum objects.

    // public static final Direction  NORTH = new Direction("North is hot") // NORTH Object is created
    NORTH("North is hot"),
    // public static final Direction  SOUTH = new Direction("South food is Awesome")
    SOUTH("South food is Awesome"),
    //public static final Direction EAST = new Direction("Sun rises  in the east direction")
    EAST("Sun rises  in the east direction"),
    //public static final Direction WEST = new Direction("West is my home")
    WEST("West is my home ");
     // All the four variables are enum objects and they are created when the class get loaded.
    // Because all of them are static.
    //Instance Variable

    String msg;

    //Constructor

    Direction(String msg) {
        this.msg = msg;
        System.out.println("Msg from constructor" +msg);
    }

    // getters and setters for field msg.
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
