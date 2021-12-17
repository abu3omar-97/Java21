package Week14;

public class StaticExamples {
    static String name;

    StaticExamples() {

        System.out.println("OBJECT CREATED " + this.name);
    }

    public void printName() {
        System.out.println(this.name);
    }
}
