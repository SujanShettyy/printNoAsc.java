//print numbers in Ascending Order
import java.util.Scanner;

public class printNoAsc {
    public static void printNumber(int n, int i) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        printNumber(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Thanks for entering the number. Here is the Ascending Order:");
        printNumber(n, 1);
    }
}
