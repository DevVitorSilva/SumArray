import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantityNumber = sc.nextInt();
        double[] values = new double[quantityNumber];
        double sum = 0;
        double avarage = 0;
        for(int i = 0; i < values.length; i++){
            values[i] = sc.nextDouble();
        }
        sc.close();
    }
}