import java.util.Scanner;
public class Task_3 {
    public void NUM(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        int number = scanner.nextInt();

        if (isTwoDigit(number) && isEven(number)) {
            System.out.println("Число " + number + " є двозначним і парним.");
        }
        else {
            System.out.println("Число " + number + " не є двозначним або парним.");
        }
    }
    public static boolean isTwoDigit(int number) {
        return (number >= 10 && number <= 99);
    }
    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }
}
