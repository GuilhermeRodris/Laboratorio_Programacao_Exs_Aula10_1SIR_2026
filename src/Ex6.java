import java.util.Random;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int i,cont;
        boolean especial = true;

        System.out.print("Informe a quantidade de números: ");
        cont = sc.nextInt();
        int[] x =  new int[cont];

        for (i = 0; i < x.length; i++) {
            x[i] = random.nextInt(1,5);
        }

        System.out.println("Array: ");
        for (i = 0; i < x.length; i++){
            System.out.print(x[i] + "\t");
        }

        for (i = 0; i < x.length - 1; i++){
            if(x[i]%2 == x[i+1]%2){
                especial = false;
                break;
            }
        }

        if(especial){
            System.out.println("É especial");
        } else {
            System.out.println("Não é especial");
        }

    }
}
