import java.util.Scanner;

public class D_Inches_to_Centimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inches = Double.parseDouble(scanner.nextLine());

        System.out.println(inches*2.54);
    }
}
