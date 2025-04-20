
public class Shape {
    private Point location;
    public Shape(Point location){
        this.location=location;
    }
    public Point getLocation() {
        return location;
    }
    public void setLocation(Point location){
       this.location=location;
    }
    public double area(){
        System.out.println("Shape class area method");
        return 0;
    }
    public double perimeter(){
        System.out.println("Shape class perimeter method");
        return 0;
    }
}
