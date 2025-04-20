public class Point {

    public int xCoord, yCoord;

    public Point(){
        this(0,0);
    }

    public Point(int x , int y){
        this.xCoord = x;
        this.yCoord = y;
    }

    public Point(int xy){
        this.xCoord = xy;
        this.yCoord = xy;
    }

    @Override
    public String toString() {
        return "Point{" +
                "xCoord=" + xCoord +
                ", yCoord=" + yCoord +
                '}';
    }
}
