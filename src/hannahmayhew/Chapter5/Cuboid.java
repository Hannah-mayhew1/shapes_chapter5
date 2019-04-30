package hannahmayhew.Chapter5;

public class Cuboid extends Prism {

    public Cuboid(Rectangle rectangle, Double height) {
        super(rectangle, height);
    }

    public String getType(){
        return "Cuboid";
    }
}
