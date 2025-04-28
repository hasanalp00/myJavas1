import java.util.Scanner;
/*overloading araştır abstract*/
abstract class bool{

}
public class Try extends bool {
    public static boolean a=true;
    public static void returnVal(){
        System.out.println("hasan");
    }
    public static boolean returnBoolean(){
        return a;
    }
    public static void main(String[] args){
        boolean a=true;
        boolean b=false;
        Scanner ab=new Scanner(System.in);
        System.out.print("Radius: ");
        System.out.println("Area: "+Math.pow(ab.nextInt(),2)*Math.PI);
        System.out.println(Try.returnBoolean());
        returnVal();
    }
}
class DemoTRY extends Try{
    public int aVal;
    public DemoTRY(int aVal){
        this.aVal=aVal;
    }

    public static void returnVal() {
        System.out.println("hello,hasan");
    }
}

