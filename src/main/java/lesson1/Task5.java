package lesson1;

/*
 * Реализовать функцию, которая принимает строку и возвращает ее же в обратном виде
 * например "Hello world!!!" -> "!!!dlrow olleH"
 */


public class Task5 {
    public static void main(String[] args) {
        System.out.println(reverse("Hello world!!!"));
    }

    public static String reverse(String str) {

        char[] charList = str.toCharArray();
        String reverseWord = "";

        for (int i = charList.length - 1; i >= 0; i--){
            reverseWord += charList[i];
        }

        return  reverseWord;
    }
}
