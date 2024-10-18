import java.util.Scanner;

public class F_Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double bags = 0.4;
        double sum = (nylon + 2) * 1.5 + (paint + paint * 0.1) * 14.5 + thinner * 5 + bags;
        sum += (sum * 0.3) * hours;

        System.out.printf("%.2f", sum);
    }
}
