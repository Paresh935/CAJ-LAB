package lab5_1;

public class TestShape {
    public static void main(String[] args){
        Square s1 = new Square();
        assert (s1.isFilled()==true) ;
        assert (s1.getColor().equals("green"));

        Square s2=new Square(6,"red",false);
        assert(s2.isFilled()==false);
        assert (s2.getColor().equals("red"));
        assert(s2.getSide()==6);

        s2.setColor("blue");
        s2.setFilled(true);
        assert(s2.isFilled()==true);
        assert (s2.getColor().equals("blue"));

        Square s3= new Square();
        s3.setColor("white");
        s3.setSide(9);
        assert(s3.getColor().equals("white"));
        assert(s3.getLength()==9);


        Circle c1 = new Circle();
        assert c1.getRadius() == 1.0;

        assert(c1.isFilled() == true);
        assert(c1.getColor().equals("green"));
        assert(c1.getRadius() == 1.0);

        assert(Math.abs(c1.getArea() - Math.PI) < 0.0001);
        assert(Math.abs(c1.getPerimeter() - 2 * Math.PI) < 0.0001);

        Circle c2 = new Circle(6, "red", false);

        assert(c2.isFilled() == false);
        assert(c2.getColor().equals("red"));
        assert(c2.getRadius() == 6);

        assert(Math.abs(c2.getArea() - (Math.PI * 6 * 6)) < 0.0001);
        assert(Math.abs(c2.getPerimeter() - (2 * Math.PI * 6)) < 0.0001);


        c2.setColor("blue");
        c2.setFilled(true);
        c2.setRadius(10);

        assert(c2.isFilled() == true);
        assert(c2.getColor().equals("blue"));
        assert(c2.getRadius() == 10);

        assert(Math.abs(c2.getArea() - (Math.PI * 10 * 10)) < 0.0001);
        assert(Math.abs(c2.getPerimeter() - (2 * Math.PI * 10)) < 0.0001);


    }
}
