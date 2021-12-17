package Week14;

public class SimpleCalculator {
    int num1;
    int num2;

    SimpleCalculator() {
        System.out.println("C1");
        this.num1 = 1;
        this.num2 = 1;
    }

    SimpleCalculator(double n1) {
        System.out.println("C4");
        this.num1 = (int) n1;
        this.num2 = 1;
    }

    SimpleCalculator(int n1, int n2) {
        System.out.println("C2");
        this.num1 = n1;
        this.num2 = n2;
    }

    SimpleCalculator(int n1) {
        System.out.println("C3");
        this.num1 = n1;
        this.num2 = 1;
    }


}
