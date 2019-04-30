package hannahmayhew.Chapter5;

public class Circle implements TwoDimensionalShape{

    double radius;
    String colour;

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public String getType() {
        return "Circle";
    }

    public double getRadius() {
        return radius;
    }

    public String getColour() {
        return colour;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

}
