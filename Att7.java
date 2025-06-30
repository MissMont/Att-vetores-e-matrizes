import java.util.Scanner;
import java.util.Arrays;

public class Att7 {
    
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        int numeros[] = new int[6];
        int impar = 0;
        int somaPares = 0;

        for(int i=0; i<numeros.length; i++){
            System.out.println("Digite um numero: ");
            numeros[i] = scanner.nextInt();
        }
        
        System.out.print("Numeros pares: ");
        for(int i=0; i<numeros.length; i++){
            if(numeros[i] % 2 == 0){
                System.out.print(numeros[i] + " ");
                somaPares = somaPares + numeros[i];
            } 
        }
        System.out.println();
        System.out.print("Numeros impares: ");
        for(int i=0; i<numeros.length; i++){
            if(numeros[i] % 2 != 0){
                System.out.print(numeros[i] + " ");
                impar++;
            } 
        }
        System.out.println();
        System.out.println("Soma dos numeros pares: " + somaPares);
        System.out.println("Quantidade de numeros impares: "+ impar);
        
           

}
}