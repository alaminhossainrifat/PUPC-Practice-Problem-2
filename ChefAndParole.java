import java.util.Scanner;

public class ChefAndParole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n >= 7) {
            System.out.println("Yes");  
        } else {
            System.out.println("No");   
        }
        scanner.close();
    }
}
