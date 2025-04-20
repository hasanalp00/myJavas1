public class Animal{
    
    /*The change of an animal's some features according to change of its weight */

    private int weightChange;
    private double speed;
    private double stamina;
    private double power;
    private double changeRate;
    public Animal(){
    }

    public Animal(Double speed,Double stamina,Double power){
        this.speed=speed;
        this.stamina=stamina;
        this.power=power;
    }
    public void printOutFeatures(){
        System.out.println("Speed: "+this.speed);
        System.out.println("Stamina: "+this.stamina);
        System.out.println("Power: "+power);
    }

    public void bulkingAnimal(int weightChange){      /*bulking means gaining weight */
        if (weightChange>0){
            this.changeRate= weightChange*0.03;
            this.power+=this.power*changeRate;
            this.speed-=this.speed*changeRate;
            this.stamina-=this.stamina*changeRate;
        }else{
            System.out.println("---The animal didnt gain weigth---");
        }
    }

    public void cuttingAnimal(int weightChange){      /*cutting means weight loss */
        if (weightChange<0){
            this.changeRate= weightChange*0.02;
            this.power+=this.power*changeRate;
            this.speed-=this.speed*changeRate;
            this.stamina-=this.stamina*changeRate;
        }else{
            System.out.println("---The animal didnt lose weight---");
        }
    }
    public static void main(String args[]){
        Animal aLion= new Animal(60.0, 90.0, 110.0);
        aLion.printOutFeatures();
        aLion.cuttingAnimal(-6);
        System.out.println("--After 6 kg weigth loss--");
        aLion.printOutFeatures();
        aLion.bulkingAnimal(10);
        System.out.println("--After 10 kg weight gain--");
        aLion.printOutFeatures();
    }

}