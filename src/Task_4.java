import java.util.Scanner;
public class Task_4 {
    public void FX(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();

        double fValue;

        if (x <= -2.5) {
            fValue = Math.exp(-x);
        } else if (x <= 0) {
            fValue = 2 + x * Math.pow(3, 3 - x * x);
        } else {
            fValue = Math.sin(x) - Math.pow(Math.cos(x), 3);
        }

        System.out.printf("f(%f) = %f\n", x, fValue);
    }
}