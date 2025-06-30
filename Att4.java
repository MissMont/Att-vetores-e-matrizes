import java.util.Arrays;

public class Att4 {
    public static void main (String[] args){

        int valores[] = new int[6];

            for(int i=0; i<valores.length; i++){
                valores[i] = (int)(Math.random() * 101);
            }

                System.out.println("Valores: "+ Arrays.toString(valores));
                System.out.println("Valores na ordem inversa: ");
                
            for(int i = 5; i >= 0; i-- ){
                System.out.println(valores[i]);
            }
        }
    }   