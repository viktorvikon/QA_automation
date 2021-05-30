package lesson1;

public class Task1 {
    /* Минимум трех чисел
    Написать функцию, которая вычисляет минимум из трёх чисел.
    */
    public static void main(String[] args) {
        System.out.println(min(5,2,3));
    }

    public static int min(int a, int b, int c) {

        int minNumber = a;

        if (b < minNumber)
            minNumber = b;
        if (c < minNumber)
            minNumber = c;

        return minNumber;

//        -----------------2 способ--------------------------
//        return Math.min(a, Math.min(b, c));
    }
}