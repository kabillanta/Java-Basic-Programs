package practicequestions;
import java.util.Scanner;
public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        for(int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
