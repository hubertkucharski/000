
import java.util.Scanner;


public class Main {
    public static void dodawanie(int x, int y){
        System.out.println("Suma: " + (x+y));
    }
    private static void odejmowanie(int x, int y){
        System.out.println("Różnica: " +(x-y));
    }
    private static void dolary(int liczba1){
        System.out.println("Liczba nr 1 na dolary (złotówki na dolary): " +(liczba1/3.65));
    }
    private static void euro(int liczba2){
        System.out.println("Liczba nr 2 na euro (zl na euro): " +(liczba2/4.33));
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
        odejmowanie(liczba1, liczba2);
        dolary(liczba1);
        euro(liczba2);
        
//        while(.)
//    }    
    }
}
