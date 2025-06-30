import java.util.Arrays;

public class Att5 {
    
    public static void main (String[] args){

        int notas[] = new int[15];
        int soma = 0;


        for(int i=0; i<notas.length; i++){
            notas[i] = (int)(Math.random() * 11);
            soma = soma + notas[i];
            System.out.println("Nota do aluno " + (i+1) + ": " +notas[i] );
        }
        float media = (float) soma / notas.length;
        System.out.println("Notas: " + Arrays.toString(notas));        
        System.out.println("Media dos 15 alunos: " + media);
    }

}