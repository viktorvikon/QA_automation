package lesson2;

import java.util.Locale;

/**
 * Реализовать у класса Task1 переменные age (тип int),  name (тип String), ageGroup(тип String)
 * реализовать методы геттеры и сеттеры для каждой переменной.
 * Должны быть выполненны следующие условия:
 *  - не должно быть возможности напрямую устанваливать или читать значение age/name
 *  - нельзя установить значение age меньше нуля
 *  - максимальныое значение для возраста - 100
 *  - значение name не может быть короче чем 3 символа и длиннее чем 50 символов
 *  - name не может состоять из одних только пробелов
 *  - не зависимо от того ввел пользователь имя с большой или с маленькой буквы,
 *      оно должно быть записано в переменную name с большой буквы
 *  - ageGroup должен устанавливаться автоматически при установке возраста
 *      - child если age до 15 лет
 *      - student  - если age от 15 до 25 лет
 *      - worker - если age от 26 до 65 лет
 *      - pensioner - если age старше 66 лет
 *  - ageGroup можно только прочитать с помощью геттера, сеттер должен быть приватным и недоступным для других классов
 */

public class Task1 {
    private int age;
    private String name;
    private String ageGroup;


    public Task1(int age, String name) {
        this.setAge(age);
        this.setName(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age >= 100){
            System.out.println("Age should be between 0 and 100!");
        }else{
            this.age = age;
            setAgeGroup();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3 && name.length() <= 50 && !name.isBlank()){
            this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        }else{
            System.out.println("\nName can't contain only spaces or contain from 3 - 100 chars ");
        }
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    private void setAgeGroup() {
       if (this.age <= 15){
           ageGroup = "child";
       }else if (age <= 25){
           ageGroup = "student";
       }else if (age <= 65){
           ageGroup = "worker";
       }else{
           this.ageGroup = "pensioner";
       }

    }

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + age + ", age-group: " + ageGroup;
    }
}
