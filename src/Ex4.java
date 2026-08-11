import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        Random random = new Random();
        double[] temperatura = new double[12];
        double mediaano = 0;
        int i, mes;

        for (i = 0; i < temperatura.length; i++){
            temperatura[i] = random.nextDouble(0,35);
            mediaano = mediaano + temperatura[i];
        }
        mediaano = mediaano / 12;

        for (i = 0; i < temperatura.length; i++){
            if (temperatura[i] < mediaano && i == 0 ){
                System.out.println("O mês 1 - Janeiro foi acima da média");
                System.out.println(String.format("%.0f°C",temperatura[i]));
            }else if (temperatura[i] < mediaano && i == 1){
                System.out.println("O mês 2 - Fevereiro foi acima da média");
                System.out.println(String.format("%.0f°C",temperatura[i]));
            }else if (temperatura[i] < mediaano && i == 2){
                System.out.println("O mês 3 - Março foi acima da média");
                System.out.println(String.format("%.0f°C",temperatura[i]));
            }else if (temperatura[i] < mediaano && i == 3){
                System.out.println("O mês 4 - Abril foi acima da média");
                System.out.println(String.format("%.0f°C",temperatura[i]));
            }else if (temperatura[i] < mediaano && i == 4){
            System.out.println("O mês 5 - Maio foi acima da média");
            System.out.println(String.format("%.0f°C",temperatura[i]));
            }else if (temperatura[i] < mediaano && i == 5){
                System.out.println("O mês 6 - Junho foi acima da média");
                System.out.println(String.format("%.0f°C",temperatura[i]));
            }else if (temperatura[i] < mediaano && i == 6){
                System.out.println("O mês 6 - Julho foi acima da média");
                System.out.println(String.format("%.0f°C",temperatura[i]));
            }else if (temperatura[i] < mediaano && i == 7){
                System.out.println("O mês 8 - Agosto foi acima da média");
                System.out.println(String.format("%.0f °C",temperatura[i]));
            }else if (temperatura[i] < mediaano && i == 8){
                System.out.println("O mês 9 - Setembro foi acima da média");
                System.out.println(String.format("%.0f°C",temperatura[i]));
            }else if (temperatura[i] < mediaano && i == 9){
                System.out.println("O mês 10 - Outubro foi acima da média");
                System.out.println(String.format("%.0f°C",temperatura[i]));
            }else if (temperatura[i] < mediaano && i == 10){
            System.out.println("O mês 11 - Novembro foi acima da média");
            System.out.println(String.format("%.0f°C",temperatura[i]));
            }else if (temperatura[i] < mediaano && i == 11){
                System.out.println("O mês 12 - Dezembro foi acima da média");
                System.out.println(String.format("%.0f°C",temperatura[i]));
            }
        }
    }
}
