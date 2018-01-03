
import java.util.Scanner;


public class Main {
    public static void dodawanie(int x, int y){
        System.out.println("Suma: " + (x+y));
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //int action = scanner.nextInt();
        //scanner.nextLine();
        System.out.println("Podaj liczbe całkowitą nr 1: ");
        int liczba1 = scanner.nextInt();
        System.out.println("Podaj liczbe całkowitą nr 2: ");
        int liczba2 = scanner.nextInt();
        
        dodawanie(liczba1, liczba2);
        
        
        
//        while(.)
//    }    
    }
}
