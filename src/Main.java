import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers will you enter? ");
        int quantityNumber = sc.nextInt();
        double[] values = new double[quantityNumber];
        double sum = 0;
        for(int i = 0; i < values.length; i++){
            System.out.print("enter value: ");
            values[i] = sc.nextDouble();
            sum += values[i];
        }
        double average = sum / values.length;
        System.out.print("Values: ");
        for(int i = 0; i < values.length; i++){
            System.out.print(" " + values[i]);
        }
        System.out.print("\n");
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f", average);
        sc.close();
    }
}