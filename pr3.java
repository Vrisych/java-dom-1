// калькулятор
import java.util.Scanner;
public class pr3 {
    static void calc () {
        Scanner read = new Scanner (System.in);
        
        System.out.println("Введите число. Если хотите закрыть калькулятор, напишите end");
        String num = read.nextLine();
        if (num.equalsIgnoreCase("end")) {
            System.out.println("Пока!");
        }
        else {
            double num1 = Double.parseDouble(num);
            System.out.println("Введите оператор (+ - * /)");
            String op = read.nextLine();
        
            if (op.equals("+")|op.equals("-")|op.equals("/")|op.equals("*")|op.equalsIgnoreCase("end")){
                System.out.println("Введите число");
                Double num2 = read.nextDouble();
                double rez=0;

                switch (op) {
                    case "+":
                    rez = num1 + num2;
                    break;

                    case "-":
                    rez = num1 - num2;
                    break;

                    case "*":
                    rez = num1 * num2;
                    break;

                    case "/":
                    rez = num1 / num2;
                    break;
                }
                System.out.printf("%f %s %f = %f \n\n", num1, op, num2, rez);
            }
            else {
                System.out.println("Ошибка. Повторите c верным оператором");
            }
            calc();
            }
        read.close();

    }
    
    public static void main(String[] args) {
        
        calc();

    }
}
