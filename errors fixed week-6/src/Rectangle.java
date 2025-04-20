


public class Rectangle extends Shape {

    public Point topLeft;
    public int sideA , sideB;
    public static int counter=0;
    public int counterforobject=0;

    public Rectangle(Point location,Point topLeft, int sideA, int sideB) {
        super(location);
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideB);
        counter++;
        counterforobject++;
    }
    public Rectangle(Point location,Point topLeft, int sideA) {
        super(location);
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideA);
        counter++;
        counterforobject++;
    }
    public Rectangle(Point location,int sideA,int sideB){
        super(location);
        setSideA(sideA);
        setSideB(sideB);
    }
    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA <= 0){
            throw new IllegalArgumentException("Side A cant be negative and zero..");
        }
        else {
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB <= 0) {
            throw new IllegalArgumentException("Side B cant be negative and zero..");
        } else {
            this.sideB = sideB;
        }
    }
    @Override
    public double perimeter(){
        return 2 * (sideA + sideB);
    }
    @Override
    public double area(){
        return sideA * sideB;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", topLeft=" + topLeft +
                ", counterforobject=" + counterforobject +
                '}';
    }
}
