import java.util.Scanner;

public class Exercicio5 {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite em ordem as notas:");

        System.out.println("Prova 1");
        double p1 = sc.nextDouble();

        System.out.println("Entrega 1");
        double e1 = sc.nextDouble();

        System.out.println("Entrega 2");
        double e2 = sc.nextDouble();

        System.out.println("API");
        double api = sc.nextDouble();

        System.out.println("Participação");
        double part = sc.nextDouble();

        System.out.println("Exame final");
        double exf = sc.nextDouble();


        double max = (p1*0.5+e1*0.2+e2*0.3+part);

        if (max > 5.9){
            double soma = (max*0.5)+api*0.5;
            System.out.println("Sua média final é: " +soma);
        }

        if (exf > 5.9) {
            System.out.println("Sua média é: " +exf);
        }

        if (max < 5.9 && exf < 5.9) {
            System.out.println("REPROVADO.  /n Sua média é: " +max);
        }

    sc.close();
    }

}

