import java.util.Scanner;

// class ThalaReason {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt(); 

//         if (N == 7) {
//             System.out.println("THALA");
//         } else {
//             System.out.println("SADGE");
//         }
//         sc.close();
//     }
// }

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ThalaReason {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); 

        if (N == 7) {
            System.out.println("THALA");
        } else {
            System.out.println("SADGE");
        }
    }
}

