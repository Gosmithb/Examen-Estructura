
import java.util.Scanner;


public class Odernar_mayor_a_menor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aux, anterior;
        
        int array[] = new int[10];
        System.out.println("llene el array");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt(); 
        }
        
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                aux = array[j + 1];
                array[j + 1] = array[j];
                array[j] = aux;
            }
        }
        
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
    }
    
    
}
