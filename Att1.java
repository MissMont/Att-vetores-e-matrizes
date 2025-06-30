import java.util.Scanner;

public class Att1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[6];

        for(int i=0; i<6; i++){
            System.out.println("Digite um valor inteiro: ");
            valores[i] = scanner.nextInt();            
        }
        System.out.println("Valores lidos: ");
        for(int i=0; i<6; i++){
            System.out.println(valores[i]);
        }
 

    }
}