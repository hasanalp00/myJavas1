

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point();
        String s1 = new String("Hasan");

        System.out.println(s1.toString());
        System.out.println(p1.xCoord);
        System.out.println(p1.yCoord);

        Point p2 = new Point(3 ,4);
        System.out.println(p2.xCoord);
        System.out.println(p2.yCoord);

        Point p3 = new Point(5);
        System.out.println(p3.xCoord);
        System.out.println(p3.yCoord);


        Point tLeft = new Point(3 ,4);
        Point itsLocation=new Point(1,1);
        Rectangle r1 =new Rectangle(itsLocation,tLeft,5,5);
        System.out.println(r1.getSideA());
        System.out.println(r1.getSideB());
        System.out.println(r1.getTopLeft().xCoord);
        System.out.println(r1.getLocation().yCoord);
        System.out.println(r1.getLocation());
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println(r1.toString());



        Point c1Location=new Point(1,1);
        Point c1Center=new Point(1,1);
        Circle c1 = new Circle(c1Location,c1Center,3);
        System.out.println(c1.getRadius());
        c1.setRadius(1);
        System.out.println(c1.getRadius());
        Rectangle r2=new Rectangle(new Point(),tLeft,10,15);
        System.out.println(r1.counterforobject);
        System.out.println(r2.counterforobject);
        System.out.println(Rectangle.counter);
        System.out.println(Circle.className);

        Point myPoint= new Point(7,3);
        System.out.println(myPoint.toString());
        Shape shape=new Shape(new Point(5,6));

        Triangle t1=new Triangle(new Point(3,2),3,4,5);
        System.out.println(t1.area());
        System.out.println(t1.perimeter());

    }

}