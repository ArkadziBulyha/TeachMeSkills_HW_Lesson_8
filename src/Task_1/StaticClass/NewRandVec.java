package Task_1.StaticClass;

import Task_1.Vec.AbstVector;
import Task_1.Vec.InterfaceVec;

import java.util.Arrays;

public class NewRandVec {

    public static String GenerateArray(int n) {

        InterfaceVec[] arrayVec = new InterfaceVec[n];

        for (int i = 0; i < arrayVec.length; i++) {
            arrayVec[i] = AbstVector.rand();
            System.out.println(arrayVec[i]);
        }

        return Arrays.toString(arrayVec);
    }
}
