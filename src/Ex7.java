import java.util.Random;

public class Ex7 {
    public static void main(String[] args) {
        Random random = new Random();
        int i,cont, grau = 0;
        int[] x = new int[7];

        for (i = 0; i < x.length; i++) {
            x[i] = random.nextInt(0,10);
        }
        System.out.println("Array: ");
        for (i = 0; i < x.length; i++){
            System.out.print(x[i] + "\t");
        }

        for (i = 0; i<x.length;i++){
            cont = 0;
            for (int j = 0; j < x.length; j++){
                if (x[i] == x[j]){
                    cont++;
                }
            }
            if (cont > grau){
                grau = cont;
            }
        }
        System.out.println("Grau:" + grau);
    }
}
