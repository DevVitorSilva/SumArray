import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantityNumber = sc.nextInt();
        double[] values = new double[quantityNumber];
        double sum = 0;
        System.out.print("How many numbers will you enter? ");
        for(int i = 0; i < values.length; i++){
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
        sc.close();
    }
}