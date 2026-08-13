import java.util.Random;

public class Ex5 {
    public static void main(String[] args) {
        Random ale = new Random();
        int[] x = new int[10];
        int i, aux,j;

        for (i = 0; i < x.length; i++){
            x[i] = ale.nextInt(1,30);
        }
        System.out.println("Original: ");
        for (i  = 0; i < x.length; i++){
            System.out.print(x[i] + " ");
        }
        System.out.println();
        j = x.length - 1;

        for (i = 0; i < x.length/2; i++, j--){
            aux = x[i];
            x[i] = x[j];
            x[j] = aux;
        }
        System.out.println("Invertida: ");
        for (i  = 0; i < x.length; i++){
            System.out.print(x[i] + " ");
        }

    }
}
