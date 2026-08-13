import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temperatura = new double[12];
        String[] mes = {"Janeiro", "Fevereiro", "Março","Abril","Maio","Junho",
        "Julho", "Agosto", "Setembro", "Outubro","Novembro", "Dezembro"};
        double mediaano = 0;
        int i;

        for (i = 0; i < temperatura.length; i++){
            System.out.print("Digite a temperatura de " + mes[i] + ": ");
            temperatura[i] = sc.nextDouble();
            mediaano = mediaano + temperatura[i];
        }
        mediaano = mediaano / temperatura.length;
        System.out.println(String.format("A média anual foi: %.2f",mediaano));
        System.out.println("Os mêses acima da média foram:");
        for (i = 0; i < temperatura.length; i++){
            if (temperatura[i] >= mediaano){
                System.out.print(String.format("%-8s", mes[i]));
                System.out.println(String.format(": %.2f°C",temperatura[i]));
            }
        }
    }
}
