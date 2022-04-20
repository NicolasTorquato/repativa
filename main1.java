import java.util.Scanner;

public class main1 {
    public static void main (String[] args){
    int fat = 1;
    Scanner fatorial = new Scanner(System.in);
    System.out.println("Digite o número que será fatorado: ");
    int valor = fatorial.nextInt();

    for( int i = 2; i <= valor; i++ ){ 
        fat *= i;
    }
         System.out.println( "O fatorial de " + valor + " é igual a " + fat );
         fatorial.close();
    } 
} 