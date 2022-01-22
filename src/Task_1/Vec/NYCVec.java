package Task_1.Vec;

public class NYCVec extends AbstVector {


    double c;

    public NYCVec(double n, double y, double c) {
        super(n, y);
        this.c = c;
    }


    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double lengthVec() {
        double length = 0;
        length = Math.sqrt(Math.pow(n, 2) + Math.pow(y, 2) + Math.pow(c, 2));
        return length;
    }

    @Override
    public String toString() {
        return "NYCVec " + "n= " + n + ", y= " + y + ", c= " + c;
    }
}
