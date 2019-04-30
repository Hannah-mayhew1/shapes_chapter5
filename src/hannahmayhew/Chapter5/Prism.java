package hannahmayhew.Chapter5;

public class Prism implements ThreeDimensionalShape {
    TwoDimensionalShape base;
    Double height;

    public Prism(TwoDimensionalShape base, Double height) {
        this.base = base;
        this.height = height;
    }

    public String getColour() {
        return base.getColour();
    }

    public String getType() {
        return base.getType() + " prism";
    }

    public double getSurfaceArea() {
        return ((base.getArea() * 2) + (base.getPerimeter() * height));
    }

    public double getVolume() {
        return base.getArea() * height;
    }

}
