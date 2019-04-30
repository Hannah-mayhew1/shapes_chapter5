package hannahmayhew.Chapter5;

public class Cylinder extends Prism {

    public Cylinder(Circle circle, Double height) {
        super(circle, height);
    }

    public String getType() {
        return "Cyclinder";
    }
}
