package hannahmayhew.Chapter5;

public class Cube extends Cuboid {

    public Cube(double length, String colour) {
        super(new Square(length, colour), length);
    }

    public String getType() {
        return "Cube";
    }
}
