import java.util.Scanner;

public class Att3 {

    public static void main(String[] args){

    
        Scanner scanner = new Scanner(System.in); 
        int[] numero = new int[10];
        int maior = 0;
        int menor = 0;
        
        for (int i = 0; i < 10; i++){
            System.out.println("Digite um numero: ");
            numero[i] = scanner.nextInt();
        }     

        maior = numero[0];
        menor = numero[0];

        for (int i = 0; i < 10; i++){
            if(numero[i] > maior){
                maior = numero[i];
            }
        }
        System.out.println("Maior: "+maior);

        for (int i = 0; i < 10; i++){
            if(numero[i] < menor){
                menor = numero[i];
            }
        }
        System.out.println("Menor: "+menor);
    }
}