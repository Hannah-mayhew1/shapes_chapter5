package hannahmayhew.Chapter5;

public class Square extends Rectangle implements TwoDimensionalShape{

    public Square(double length, String colour) {
        super(length, length, colour);
    }

    public String getType() { //because this has the same signature, this child method overrides the inherited parent method
        return "Square";
    }
}
