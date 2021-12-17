package Week15;

public class Student {
    // WHAT IT HAS?
    private String name;
    private int grade;
    private String classID;

    // WHAT IT DOES?

    public Student(String name, int grade, String classID) {
        this.name = name;
        if(grade<0) grade = grade * -1;
        this.grade = grade;
        this.classID = classID;
    }

    public Student(String name) {
        this.name = name;
        this.grade = 50;
        this.classID = "1";
    }

    public Student() {
        System.out.println("EMPTY CONST");
    }

    public void sayMyName(){
        System.out.println("MY NAME IS: " + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getClassID() {
        return classID;
    }


}
