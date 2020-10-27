
import java.util.Scanner;


public class Examen_2 {
    
    public static void main(String[] args) {
        
        int n = 0, m = 0, r;
        System.out.println("Ingrese un numero");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        while (n != 0) {
            r = n % 10;
            m = (m * 10) + r;
            n /= 10;
        }
        System.out.println("Inverso: " + m);
    }
}
