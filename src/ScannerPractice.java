import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        do {
            System.out.print("input 5 >>> ");
            x = sc.nextInt();
        }while(x != 5);

        System.out.println("loop done");
    }
}
