import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[3];
        //entrada
        for (int i = 0; i < x.length; i++){
            System.out.print("informe um valor --> ");
            x[i] = sc.nextInt();
        }

        //saída
        for (int i = 0; i < x.length; i++) {
            System.out.println(i + " = " + x[i]);
        }
    }
}