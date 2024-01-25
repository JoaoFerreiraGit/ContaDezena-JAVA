package contadezena;
import java.util.Scanner;
public class ContaDezena {

    public static void main(String[] args) {
        System.out.println("Digite um número");
        Scanner numero = new Scanner(System.in);
        int n1 = numero.nextInt();
        int dezena = n1/10;
        
        if (dezena <= 1) {
        System.out.println("Seu Número tem "+ dezena +" Dezena!");
        } else {
            System.out.println("Seu Número tem "+ dezena +" Dezenas!");
        }
        
        
    }
}
    

