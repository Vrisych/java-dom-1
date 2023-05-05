// треугольник и факториал
import java.util.Scanner;
public class pr1 {
    static void triangle (int N) {
        int sum = 0;
        for (int i =1; i<=N; i++) sum = sum + i;
        System.out.println("Сумма чисел от 1 до " +N+ " равна " + sum);
    }

    static void factorial (int N) {
        int f = 1;
        for (int i =2; i<=N; i++) f = f * i;
        System.out.println("Факториал числа " +N+ " равна " + f);
    }

    public static void main(String[] args) {
        System.out.println("Введите n");
        Scanner read = new Scanner (System.in);
        int n= read.nextInt();
        triangle(n);
        factorial(n);
        read.close();

    }
}