import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your starting sum: ");
        double startSum = input.nextDouble();
        System.out.println("Enter your period in years: ");
        int period = input.nextInt();
        System.out.println("Enter your yield: ");
        double yield = input.nextDouble();

        for (int i = 1; i <= period; i++) {
            double calc = startSum + (startSum * (yield/100));
            startSum = calc;
        }

        System.out.println(startSum);
    }
}
