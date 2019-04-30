package hannahmayhew.Chapter5;

public class Rectangle implements TwoDimensionalShape{

    double width;
    double height;
    String colour;

    public Rectangle (double width, double height, String colour) {
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    public String getType() {
        return "Rectangle";
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColour() {
        return colour;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return ((width * 2) + (height * 2));
    }

}
