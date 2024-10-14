import java.util.*;
import java.lang.*;
import java.io.*;

class CChef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt();
            
            int chefinaAge = X - 10;
            
            System.out.println(chefinaAge);
        }
        
        scanner.close();
    }
}
