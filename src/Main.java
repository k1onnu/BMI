import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        System.out.println("\t\t\t***Добро пожаловать в калькулятор BMI***\n");

        System.out.println("Введите рост: ");
        double height = new Scanner(System.in).nextDouble();

        System.out.println("Введите вес: ");
        double weight = new Scanner(System.in).nextDouble();

        double formula = weight / (height * height);
        System.out.println("Ваш BMI: " + formula);

    }
}