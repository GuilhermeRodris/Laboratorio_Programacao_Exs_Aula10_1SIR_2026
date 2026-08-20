import java.util.Random;

public class Ex10 {
    public static void main(String[] args) {
        Random random = new Random();
        int i, menor, maior;
        int[] x = new int[10];

        for (i = 0; i < x.length; i++) {
            x[i] = random.nextInt(0, 123);
        }
        System.out.println("Array: ");
        for (i = 0; i < x.length; i++) {
            System.out.print(x[i] + "\t");
        }
        System.out.println();
        for (i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (x[i] < x[j]) {
                    menor = x[j];
                    maior = x[i];
                    x[i] = menor;
                    x[j] = maior;
                }
            }
        }
        System.out.println("Array: ");
        for (i = 0; i < x.length; i++){
            System.out.print(x[i] + "\t");
        }
    }
}