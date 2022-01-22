package Task_1.Runner;

import Task_1.StaticClass.NewRandVec;
import Task_1.Vec.InterfaceVec;
import Task_1.Vec.NYCVec;
import Task_1.Vec.NYVec;
import Task_1.Сalculation.Calculation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        InterfaceVec vec1 = new NYVec(4,-1);
        InterfaceVec vec11 = new NYVec(5, -7);
        InterfaceVec vec2 = new NYCVec(3,9,6);
        InterfaceVec vec22 = new NYCVec(7,-5,8);
        InterfaceVec vec23 = new NYCVec(8,4,-9);

        System.out.println("Длина Вектора1 : " + vec1.lengthVec());
        System.out.println("Длина Вектора2: " + vec2.lengthVec());
        System.out.println("Скалярное произведение двухмерной системы координат: " + Calculation.scalarochka(vec1, vec11));
        System.out.println("Скалярное произведение трёхмерной системы координат: " + Calculation.scalarochka(vec22, vec23));
        System.out.println("Сложение двухмерных векторов: " + Calculation.plusVector(vec1, vec11));
        System.out.println("Сложение трёхмерных векторов: " + Calculation.plusVector(vec2, vec22));
        System.out.println("Разность двухмерных векторов: " + Calculation.minusVector(vec1, vec11));
        System.out.println("Разность трёхмерных векторов: " + Calculation.minusVector(vec2, vec22));

        if (vec1.equals(vec11)){
            System.out.println("Вектора равны");
        } else {
            System.out.println("Вектора не равны");
        }

        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(NewRandVec.GenerateArray(scanner.nextInt()));
    }
}
