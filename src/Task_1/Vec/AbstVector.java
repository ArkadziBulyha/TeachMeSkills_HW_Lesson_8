package Task_1.Vec;

import java.util.Random;

public abstract class AbstVector implements InterfaceVec {

    double n;
    double y;

    public AbstVector(double n, double y) {
        this.n = n;
        this.y = y;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    static public AbstVector rand() {
        Random rand = new Random();
        AbstVector vec;
        if (rand.nextBoolean()) vec = new NYVec(rand.nextInt(10) + 1, rand.nextInt(10) + 1);
        else {
            vec = new NYCVec(rand.nextInt(10) + 1, rand.nextInt(10) + 1, rand.nextInt(10) + 1);
        }
        return vec;
    }
}
