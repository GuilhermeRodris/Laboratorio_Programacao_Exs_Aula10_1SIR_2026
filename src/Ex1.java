import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, i;

        for (i = 0; i < x.length; i++){
            System.out.print("Informe um número: ");
            x[i] = sc.nextInt();
        }

        for (i = 0; i < x.length; i++){
            if (x[i] > maior){
                maior = x[i];
            }
            if (x[i] < menor){
                menor = x[i];
            }
        }
        System.out.println("O maior número foi -> " + maior);
        System.out.println("O menor número foi -> " + menor);
    }

}