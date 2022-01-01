package GeometricPackage;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.setX(x);
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if(x < 0) x = x * -1;
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
