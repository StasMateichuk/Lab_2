import java.util.Scanner;
public class Task_2 {
    public void FQ(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть координату x: ");
        double x = scanner.nextDouble();

        System.out.print("Введіть координату y: ");
        double y = scanner.nextDouble();

        int quadrant = findQuadrant(x, y);
        System.out.println("Точка знаходиться в " + quadrant + " квадранті.");
    }

    public static int findQuadrant(double x, double y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }
}