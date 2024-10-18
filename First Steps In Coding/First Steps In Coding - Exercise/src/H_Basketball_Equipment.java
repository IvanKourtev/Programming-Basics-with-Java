import java.util.Scanner;

public class H_Basketball_Equipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int price = Integer.parseInt(scanner.nextLine());

            double sneakers = price * 0.6;
            double kit = sneakers * 0.8;
            double ball = kit * 0.25;
            double accessories = ball * 0.2;
            double sum = price + sneakers + kit + ball + accessories;

            System.out.println(sum);
    }
}
