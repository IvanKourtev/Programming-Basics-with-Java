import java.util.Scanner;

public class C_Deposit_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        double deadline = Double.parseDouble(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double sum = deposit + deadline * ((deposit * (percent/100)) / 12);

        System.out.println(sum);
    }
}
