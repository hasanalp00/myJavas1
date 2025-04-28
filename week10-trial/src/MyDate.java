public class MyDate {
    public int day,month,year;
    /*
    public int[] months31 = {1,3,5,7,8,10,12};
    public int[] months30 = {4,6,9,11};
    */
    int[] maxDays={31,29,31,30,31,30,31,31,30,31,30,31};

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public boolean inLeapYear(){
        return this.year%4==0;
    }
    public void incrementDay(){

        int newday=this.day+1;
        if(newday>this.maxDays[this.month-1]){
            this.day=1;
            this.incrementMonth();
        }else if(this.month==2 && newday==29 && !inLeapYear()){
            this.day=1;
            this.incrementMonth();
        }else{
            this.day=newday;
        }
    }
    public void incrementMonth(){
        if(this.month==12){
            this.month=1;
            this.incrementYear();
        }else{
            this.month++;
        }
    }
    public void incrementYear(){
        this.year++;
    }
    public void decrementDay(){
        int newday=this.day-1;
        if(newday==0 && this.month!=3){
            this.day=this.maxDays[this.month-1];
            this.decrementMonth();
        }else if(this.month==3 && newday==0&& !inLeapYear()){
            this.day=maxDays[this.month-2]-1;
            this.decrementMonth();
        }else{
            this.day--;
        }
    }
    public void decrementMonth(){
        if(this.month==1){
            this.month=12;
            this.decrementYear();
        }else{
            this.month--;
        }
    }
    public void decrementYear(){
        this.year--;
    }



    @Override
    public String toString() {
        return "MyDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
