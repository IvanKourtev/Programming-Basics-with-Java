import java.util.Scanner;

public class G_Food_Delivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegetarian = Integer.parseInt(scanner.nextLine());

        double delivery = 2.5;
        double sum = chicken * 10.35 + fish * 12.4 + vegetarian * 8.15;
        sum += sum * 0.2 + delivery;

        System.out.println(sum);
    }
}
