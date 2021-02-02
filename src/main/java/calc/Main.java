package calc;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ArithmeticException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Calculation calc = new Calculation();
        System.out.println("Sum : "+calc.add(a,b));
        System.out.println("Division : "+calc.divide(a,b));
        System.out.println("Multiplication : "+calc.multiply(a,b));
        System.out.println("Subtract : "+calc.subtract(a,b));
        sc.close();
    }
}
