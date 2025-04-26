import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int total = 0;

        do {
            System.out.println("Enter the number: ");
            n = sc.nextInt();
            if (n % 4 == 0) {
                total += n;
            }
        } while (n % 2 == 0);

        System.out.println("Total: " + total);
    }
}
