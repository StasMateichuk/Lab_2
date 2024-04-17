import java.util.Scanner;
public class Task_5 {
    public void MENU(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Виберіть операцію:");
            System.out.println("1. Обчислити добуток двох чисел");
            System.out.println("2. Обчислити суму двох чисел");
            System.out.println("3. Обчислити різницю двох чисел");
            System.out.println("4. Вийти");
            System.out.print("Ваш вибір: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    multiplyNumbers();
                    break;
                case 2:
                    addNumbers();
                    break;
                case 3:
                    subtractNumbers();
                    break;
                case 4:
                    System.out.println("Програма завершує роботу.");
                    System.out.println("-------------------------------------------------------");
                    System.exit(0);
                default:
                    System.out.println("Некоректний вибір. Виберіть опцію від 1 до 4.");
            }
        }
    }

    public static void multiplyNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();

        double product = num1 * num2;
        System.out.println("Добуток чисел: " + product);
    }

    public static void addNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        System.out.println("Сума чисел: " + sum);
    }

    public static void subtractNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();

        double difference = num1 - num2;
        System.out.println("Різниця чисел: " + difference);
    }
}
