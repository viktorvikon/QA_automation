package lesson1Advanced;

/*
Семантическое версионирование
Реализовать метод который принимает на вход две строки
с версиями программы ("1.0.1.2", "1.1.1.2")
и возвращает версию более ранней
Подсказка - для решения строки надо разбить на массивы
Про семантическое версионирование почитать можно здесь https://semver.org/lang/ru/
*/


public class Task4 {

    public static void main(String[] args) {
        String lovestVersion = minVersion("1.0.0.1.2", "1.0.0.2.2");
        System.out.println(lovestVersion);
    }

    public static String minVersion(String v1, String v2) {
        String[] getNumOf_v1 = v1.split("\\.");
        String[] getNumOf_v2 = v2.split("\\.");

        String num_v1 = "";
        for (String str : getNumOf_v1) {
            num_v1 += str;
        }

        String num_v2 = "";
        for (String str : getNumOf_v2) {
            num_v2 += str;
        }

        if (Integer.parseInt(num_v1) > Integer.parseInt(num_v2)){
            return v1;
        }else{
            return v2;
        }
    }
}
