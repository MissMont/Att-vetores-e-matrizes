import java.util.Arrays;

public class Att6 {
    
    public static void main (String[] args){

        int vetorA[] = new int[10];
        int vetorB[] = new int[10];
        int vetorC[] = new int[10];
        
        for(int i=0; i<vetorA.length; i++){
            vetorA[i] = (int)(Math.random() * 101);
        }

        for(int i=0; i<vetorB.length; i++){
            vetorB[i] = (int)(Math.random() * 101);
        }

        for(int i=0; i< vetorC.length; i++){
            vetorC[i] = vetorA[i] - vetorB[i];
        }
        
        System.out.println("Vetor A:  " + Arrays.toString(vetorA));
        System.out.println("Vetor B:  " + Arrays.toString(vetorB));
        System.out.println("Vetor C (A - B):  " + Arrays.toString(vetorC));
    }
}