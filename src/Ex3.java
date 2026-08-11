import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        Random random = new Random();
        double[] media = new double[10];
        int i,apro =0,napro = 0,aluno = 1;
        double n1,n2,n3,n4;

        for (i = 0; i < media.length; i++){
            n1 = random.nextDouble(0,11);
            n2 = random.nextDouble(0,11);
            n3 = random.nextDouble(0,11);
            n4 = random.nextDouble(0,11);

            media[i] = (n1 + n2 + n3 + n4)/4;
            System.out.println("A media do " + aluno + "° aluno foi");
            if (media[i] >= 10){
                System.out.println(String.format("%.0f",media[i]));
            }
            System.out.println(String.format("%.2f",media[i]));
            aluno++;

        }
        for (i = 0; i < media.length; i++){
            if (media[i] >= 6){
                apro++;
            }else {
                napro++;
            }

        }
        System.out.println("Foram aprovados: " + apro);
        System.out.println("Não foram aprovados: " + napro);
    }
}