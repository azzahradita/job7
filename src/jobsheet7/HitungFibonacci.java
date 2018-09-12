package jobsheet7;
import java.util.Scanner;
public class HitungFibonacci {
    private static void tampilJudul(String identitas)
    {
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nHitung Fibonaccci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
    }
    
    public static void main(String[] args) 
    {
        String identitas = "Az Zahra Dita Pratiwi / X RPL 3 / 9";
    
        tampilJudul(identitas);
        int n = tampilInput();
    }
    private static int tampilInput()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bilangan ke-: ");
        int n = scanner.nextInt();
        
        return n;
    }
}