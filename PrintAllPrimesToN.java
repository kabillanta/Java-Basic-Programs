package practicequestions;
import java.util.Scanner;
public class PrintAllPrimesToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.print("Prime numbers between 1 and " + n + ": ");
        for(int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
