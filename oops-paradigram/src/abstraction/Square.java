package abstraction;

public class Square implements Shape {
    float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("I'm drawing Square");

    }

    @Override
    public double calculateArea() {
        return side*side;
    }
}
