import java.util.Scanner;
public class Task_1 {
    public void QES() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ax^2 + bx + c = 0:");
        System.out.println("Введіть коефіцієнти a, b і c");
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Розв'язки рівняння: ");
            System.out.println("x1 = " + root1);
            System.out.println("x2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Розв'язок рівняння: x = " + root);
        } else {
            System.out.println("Рівняння не має дійсних розв'язків");
        }
    }
}