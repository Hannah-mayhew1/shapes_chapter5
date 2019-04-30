package hannahmayhew.Chapter5;

public class Main {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10.0, 12.0, "Yellow");
        Rectangle r2 = new Rectangle(20.0, 5.0, "Blue");

        Circle c1 = new Circle(5.0, "Green");
        Circle c2 = new Circle(10.0, "Red");

        Square s1 = new Square(5, "Black");

        Prism p1 = new Prism(c1, 5.0);
        Cube cube1 = new Cube(5.0, "Brown");
        Cylinder cylinder1 = new Cylinder(c2, 7.0);
        Cuboid cuboid1 = new Cuboid(r2, 5.0);

        System.out.println(r1.prettyPrint());
        System.out.println(r2.prettyPrint());
        System.out.println(c1.prettyPrint());
        System.out.println(c2.prettyPrint());
        System.out.println(s1.prettyPrint());
        System.out.println(p1.prettyPrint());
        System.out.println(cube1.prettyPrint());
        System.out.println(cylinder1.prettyPrint());
        System.out.println(cuboid1.prettyPrint());
    }

}
