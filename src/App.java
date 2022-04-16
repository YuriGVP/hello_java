import java.util.Scanner;

// ARRAYS

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Quantos alunos são? ");
        int quantidade = in.nextInt();

        String[] nomes = new String[quantidade];
        double[] notas = new double[quantidade];

        for (int i = 0; i < quantidade; i++){
            System.out.println("Qual o nome do aluno? ");
            nomes[i] = in.next();

            System.out.println("Qual a nota de " + nomes[i] + "?");
            notas[i] = in.nextDouble();
        }

        for (int i = 0; i < quantidade; i++){
            if (notas[i] >= 7){
                System.out.println(nomes[i] + " foi aprovado com nota " + notas[i]);
            }else {
                System.out.println(nomes[i] + " foi reprovado com nota " + notas[i]);
            }
        }

        in.close();

    }
}
