import java.util.Scanner;

public class Att2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int impar = 0;
        int par = 0;

        for(int  i=0; i<10; i++){
            System.out.println("Digite um numero: ");
            numeros[i] = scanner.nextInt(); 
            
        }

        System.out.println("Números pares");
        for(int  i=0; i<numeros.length; i++){
            if(numeros[i] % 2 == 0){
                System.out.println(numeros[i] + " ");
                par++;
            } 
        }
        
        System.out.println("Numeros impares: ");
        for(int i=0; i<numeros.length; i++){
            if(numeros[i] % 2 != 0){
                System.out.println(numeros[i] + " ");
                impar++;
            } 
        }
         System.out.println(" ");
        System.out.println("Quantidade de numeros pares: " + par);
        System.out.println("Quantidade de numeros impares: " + impar);
    }
}