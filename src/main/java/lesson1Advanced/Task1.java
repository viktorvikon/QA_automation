package lesson1Advanced;


/* Минимум n чисел
Написать функцию, которая вычисляет минимум из массива чисел.
*/

public class Task1 {

    public static void main(String[] args) {
        int[] firstArray = {2,4,6};
        int[] secondArray = {2,4,6,1,90,2,0};
        int[] thirdArray = {};
        System.out.println(min(firstArray));
        System.out.println(min(secondArray));
        System.out.println(min(thirdArray));

    }

    public static int min(int[] a) {
        if (a.length==0){
            System.out.print("You set empty array: ");
            return 0;
        }

        int minValue = a[0];
        for(int i = 1;i < a.length; i++){
            if(a[i] < minValue){
                minValue = a[i];
            }
        }
        return minValue;
    }
}


