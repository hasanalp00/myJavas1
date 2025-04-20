public class Person{
    private String name;
    private int id;
    private String email;
    private String password;
    public Person(String name, int id, String email, String password) {
        this.email = email;
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() { // we can get all informations thanks to getter methods
        return password;
    }

}
class Student extends Person{ // inherits person class
    private String course;
    private String grade;
    public Student(String email, int id, String name, String password,String course,String grade){
        super(name,id,email,password); // inherits Person class variables
        this.course=course;
        this.grade=grade;
    }

    public String getCourse() { //to get course name
        return course;
    }

    public String getGrade() { //to get grade
        return grade;
    }
    public void setCourse(Lecturer lecturerX){ // add course data from Lecture class
        course=lecturerX.getCourse();
        grade=lecturerX.getGrade();
    }
}
class Lecturer extends Person{
    private String course;
    private String addgrade;
    private boolean gradeCreated=false;
    public Lecturer(String name, int id, String email, String password,String course) {
        super(name, id, email, password);
        this.course=course;
    }

    public String getGrade() {
        if(gradeCreated) { // this if-else block except errors
            return addgrade;
        }else{
            return "--Grade's not entered--";
        }
    }

    public void addGrade(String addgrade) { // creates grade
        this.addgrade = addgrade;
        gradeCreated=true;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

}
