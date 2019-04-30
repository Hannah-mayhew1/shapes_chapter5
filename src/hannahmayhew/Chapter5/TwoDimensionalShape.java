package hannahmayhew.Chapter5;

public interface TwoDimensionalShape extends Shape{
    double getPerimeter();
    double getArea();

    default String prettyPrint() {
        return "A " + getColour() + " " + getType() + " with perimeter " + getPerimeter() + " and area " + getArea();
    }
}
