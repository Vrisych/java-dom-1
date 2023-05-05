//Вводится массив (сначала количество элементов, потом сами элементы). Найдите сумму его элементов с чётными индексами и выведите её. А потом выведите числа, которые суммировались.

import java.util.Scanner;
public class pr6 {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        System.out.println("Введите число элементов массива");
        int N = read.nextInt();
        System.out.println("Введите элементы массива");

        int [] arr = new int [N];

        int sum=0;
        for (int i = 0; i<N; i++) {
            arr [i]= read.nextInt();
        }
        for (int i = 0; i<N; i+=2) {
            sum += arr [i];
        }
        System.out.println("Сумма четных элементов массива равна " +sum);
        System.out.println("Четные элементы массива");
        for (int i = 0; i<N; i+=2) {
            System.out.println(arr [i]);
        }
        read.close();
    }
}
