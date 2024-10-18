import java.util.Scanner;

public class I_Fish_Tank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int weight = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        percent /= 100;
        double volume = (length * weight * height);
        volume /= 1000;
        volume *= (1-percent);

        System.out.println(volume);
    }
}
