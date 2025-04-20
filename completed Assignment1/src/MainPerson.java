public class MainPerson{
     public static void main(String[] args){
         Course calculus2=new Course("Calculus II",1851);
         Person hasan=new Person("hasan",230717051,"hasanalp@gmail.com","123456");
         Lecturer nazan=new Lecturer("Nazan",101010,"nazan123@gmail.com","123",calculus2.getCourseName());
         Student selim=new Student("selim@123",23023020,"selim","0987",calculus2.getCourseName(),"FF");
         System.out.println(nazan.getCourse());
         nazan.setCourse("Calculus II");
         System.out.println(nazan.getCourse());
         System.out.println("Selim's previous grade: "+selim.getGrade());
         System.out.println(nazan.getGrade());
         nazan.addGrade("CC");
         selim.setCourse(nazan);
         System.out.println("Selim's new grade: "+selim.getGrade());


    }
}
