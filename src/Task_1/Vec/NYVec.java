package Task_1.Vec;

import Task_1.Vec.AbstVector;

import java.util.Objects;

public class NYVec extends AbstVector {

    public NYVec(double n, double y) {
        super(n, y);
    }


    @Override
    public double lengthVec() {
        double length = 0;
        length = Math.sqrt(Math.pow(n, 2) + Math.pow(y, 2));
        return length;
    }

    @Override
    public String toString() {
        return "NYVec " + " n= " + n + ", y= " + y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NYVec vector = (NYVec) o;
        return Double.compare(vector.n, n) == 0 && Double.compare(vector.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(n, y);
    }


}
