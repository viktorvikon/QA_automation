package lesson2;

public class Run_Task1_lesson2 {
    public static void main(String[] args) {
        Task1 person = new Task1(15, "ivan");
        System.out.println(person);
        Task1 person2 = new Task1(26, "PeTer");
        System.out.println(person2);
        Task1 person3 = new Task1(16, "Zhana");
        System.out.println(person3);
        Task1 person4 = new Task1(72, "Klara");
        System.out.println(person4);
        person2.setName("    ");
        System.out.println(person2);
    }
}
