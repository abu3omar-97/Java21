package Week14;

public class OverLoading {
    public int sum(int n1, int n2, int n3){
        System.out.println("SUM1");
        return n1+n2+n3;
    }

    public int sum(double n1, int n2, int n3){
        System.out.println("SUM2");
        return (int) (n1+n2+n3);
    }

    public int sum(int n1, int n2, int n3, int n4, int n5){
        System.out.println("SUM3");
        return this.sum(n1,n2,n3) + n4 + n5;
    }

    public double sum(int n1, int n2, int n3, int n4){
        System.out.println("SUM4");
        return  n1+n2+n3+n4;
    }

    public double sum(double n1, double n2, double n3, double n4){
        System.out.println("SUM5");
        return  n1+n2+n3+n4;
    }





}
