package Task_1.Сalculation;

import Task_1.Vec.InterfaceVec;
import Task_1.Vec.NYCVec;
import Task_1.Vec.NYVec;

public class Calculation {

    public static double scalarochka(InterfaceVec vec1, InterfaceVec vec2) {
        if (vec1 instanceof NYVec && vec2 instanceof NYVec) {
            return (vec1.getN() * vec2.getN() + vec1.getY() * vec2.getY());
        } else if (vec1 instanceof NYCVec && vec2 instanceof NYCVec) {
            return (vec1.getN() * vec2.getN() + vec1.getY() * vec2.getY() +
                    ((NYCVec) vec1).getC() * ((NYCVec) vec2).getC());
        } else {
            return 0;
        }
    }


    public static InterfaceVec plusVector (InterfaceVec vec1, InterfaceVec vec2){
        if (vec1 instanceof NYVec && vec2 instanceof NYVec) {
            double coordination1 = vec1.getN() + vec2.getN();
            double coordination2 = vec1.getY() + vec2.getY();
            InterfaceVec vecNew = new NYVec(coordination1, coordination2);
            return vecNew;
        } else if (vec1 instanceof NYCVec && vec2 instanceof NYCVec){
            double coordination1 = vec1.getN() + vec2.getN();
            double coordination2 = vec1.getY() + vec2.getY();
            double coordination3 = ((NYCVec) vec1).getC() + ((NYCVec) vec2).getC();
            InterfaceVec vecNew = new NYCVec(coordination1, coordination2, coordination3);
            return vecNew;
        } else {
            return null;
        }
    }

    public static InterfaceVec minusVector (InterfaceVec vec1, InterfaceVec vec2){
        if (vec1 instanceof NYVec && vec2 instanceof NYVec) {
            double coordination1 = vec1.getN() - vec2.getN();
            double coordination2 = vec1.getY() - vec2.getY();
            InterfaceVec vecNew = new NYVec(coordination1, coordination2);
            return vecNew;
        } else if (vec1 instanceof NYCVec && vec2 instanceof NYCVec){
            double coordination1 = vec1.getN() - vec2.getN();
            double coordination2 = vec1.getY() - vec2.getY();
            double coordination3 = ((NYCVec) vec1).getC() - ((NYCVec) vec2).getC();
            InterfaceVec vecNew = new NYCVec(coordination1, coordination2, coordination3);
            return vecNew;
        } else {
            return null;
        }
    }

}
