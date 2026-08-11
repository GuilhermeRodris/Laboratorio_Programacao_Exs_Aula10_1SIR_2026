import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
        int i, par = 0, impar = 0;

        for (i = 0; i < x.length; i++){
            System.out.print("Informe um número: ");
            x[i] = sc.nextInt();
        }
        for (i = 0; i < x.length; i++){
            if (x[i] % 2 ==0){
                par++;
            }else {
                impar++;
            }
        }
        System.out.println("A quantidade de números pares foi: " + par);
        System.out.println("A quantidade de números impares foi: " + impar);
    }
}