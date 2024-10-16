import java.util.Scanner;

public class D_Vacation_Books_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int pagesPerDay = pages / pagesPerHour;
        pagesPerDay /= days;

        System.out.println(pagesPerDay);
    }
}
