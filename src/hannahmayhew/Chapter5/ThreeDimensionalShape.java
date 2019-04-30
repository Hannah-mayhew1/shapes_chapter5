package hannahmayhew.Chapter5;

public interface ThreeDimensionalShape extends Shape {
    double getSurfaceArea();
    double getVolume();

    default  String prettyPrint() {
        return "A " + getColour() + " " + getType() + " with Surface Area " + getSurfaceArea() + " and Volume " + getVolume();
    }

}
