import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Введите первое целое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int b = scanner.nextInt();

        scanner.close();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }


        int sum = a + b;
        int difference = a - b;
        int multiplication = a * b;
        int division = a / b;


        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Умножение: " + multiplication);
        System.out.println("Деление: " + division);
    
    }
}
