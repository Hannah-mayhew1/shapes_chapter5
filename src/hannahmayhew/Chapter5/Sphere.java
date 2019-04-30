package hannahmayhew.Chapter5;

public class Sphere implements ThreeDimensionalShape {

    public double radius;
    public String colour;

    public double getRadius(){
        return radius;
    }

    public double getSurfaceArea() {
        return (4 * Math.PI * (radius * radius));
    }

    public double getVolume() {
        return (4 * Math.PI * (radius * radius * radius) / 3);
    }

    public String getType() {
        return "Sphere";
    }

    public String getColour() {
        return colour;
    }

}
