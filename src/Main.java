import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("-Задание 1-" + "\n" + "Введите любую строку");
        task1();
        // Задание 2
        System.out.println("-Задание 2-");
        int i1 = 3;
        int i2 = 56;
        StringBuilder s2 = new StringBuilder( i1 + " + " + i2 + " = " + (i1+i2));
        System.out.println(s2);
        StringBuilder s3 = new StringBuilder( i1 + " - " + i2 + " = " + (i1-i2));
        System.out.println(s3);
        StringBuilder s4 = new StringBuilder( i1 + " * " + i2 + " = " + (i1*i2));
        System.out.println(s4);
        System.out.println(s2.insert(8, "равно").deleteCharAt(7));
        System.out.println(s3.replace(7,8,"равно"));
        // Задание 3
        System.out.println("-Задание 3-");
        task3();
        // Задание 4
        System.out.println("-Задание 4-");
        task4();
        // Задание 5
        System.out.println("-Задание 5-");
        task5("Шляпугин Михаил", 5, "Программирование на Java");
    }
    public static void task1() {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        System.out.println(s1.charAt(s1.length()-1));
        System.out.println(s1.endsWith("!!!"));
        System.out.println(s1.startsWith("I like"));
        System.out.println(s1.contains("Java"));
        System.out.println(s1.indexOf("Java"));
        System.out.println(s1.replace("a", "o"));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.substring(7, 11));
    };
    public static void task3() {
        String text = "Object-oriented programming is a programming language model organized" +
                        "around objects rather than \"actions\" and data rather than logic." +
                        " Object-oriented programming blabla. Object-oriented programming bla";

        String str = "object-oriented programming";
        String str2 = "OOP";
        int index = 0;
        int count = 0;

        while (true) {
            index = text.toLowerCase().indexOf(str, index);
            if (index != -1) {
                if (count % 2 != 0) {
                    text = text.substring(0, index) + str2 + text.substring(index + str.length());
                }
                count++;
                index += str.length();
            } else {
                break;
            }
        }
        System.out.println(text);
    };
    public static void task4() {
        System.out.println("Введите первую строку");
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        StringBuilder ss1 = new StringBuilder(s1.substring(s1.length()/2 - 1, s1.length()/2 + 1));
        System.out.println("Введите вторую строку");
        String s2 = scan.nextLine();
        StringBuilder ss2 = new StringBuilder(s2.substring(s2.length()/2 - 1, s2.length()/2 + 1));
        System.out.println(s1 + " " + ss1 + "\n" +
                            s2 + " " + ss2);
    };
    public static void task5(String name, int mark, String subject) {
        System.out.printf("Студент %15s получил %3s по %10s ", name, mark, subject);

    }
}