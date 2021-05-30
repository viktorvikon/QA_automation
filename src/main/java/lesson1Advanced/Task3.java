package lesson1Advanced;

/*
Вывести на экран любой символ пирамидкой в обратную сторону высотой в 10 строк.
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом
*/

public class Task3 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            for (int j = 10 - i; j >= 0; j--){
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
