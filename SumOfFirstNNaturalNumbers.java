package practicequestions;
import java.util.Scanner;
public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int sum = n * (n + 1) / 2;
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
        sc.close();
    }
}
