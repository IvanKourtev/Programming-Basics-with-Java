import java.util.Scanner;

public class I_Yard_Greening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double meters = Double.parseDouble(scanner.nextLine());

        double sum = meters * 7.61;
        double discount = sum * 0.18;
        sum -= discount;

        System.out.printf("The final price is: %.2f lv.\n", sum);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
