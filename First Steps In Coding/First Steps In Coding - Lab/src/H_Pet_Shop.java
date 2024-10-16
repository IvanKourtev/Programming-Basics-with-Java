import java.util.Scanner;

public class H_Pet_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogsFood = Integer.parseInt(scanner.nextLine());
        int catsFood = Integer.parseInt(scanner.nextLine());
        double sum = dogsFood * 2.5 + catsFood * 4;

        System.out.printf("%.1f leva.", sum);
    }
}
