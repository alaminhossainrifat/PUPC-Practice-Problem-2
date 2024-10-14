import java.util.Scanner;

public class DSum { 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            
            int sumOfDigits = (n / 10) + (n % 10);
            
            System.out.println(sumOfDigits);
        }
        
        scanner.close();
    }
}
