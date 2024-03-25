import java.util.Scanner;

public class Ex14 {
    public void ex14() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("informe o tamnaho dos vestores: ");
        int tamanho = leitor.nextInt();

        int vetor[] = new int[tamanho];

        for(int i = 0; i < tamanho ; i++){
            System.out.print("Digite o elementos do vetor: ");
            vetor[i] = leitor.nextInt();
        }

        
        // Encontra o índice do maior elemento no vetor
        int indiceMaior = 0;        
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > vetor[indiceMaior]) {
                indiceMaior = i;
            }
        }


        // Move o maior elemento para a última posição
        int maior = vetor[indiceMaior];
        for (int i = indiceMaior; i < vetor.length - 1; i++) {
            vetor[i] = vetor[i + 1];
        }
        vetor[vetor.length - 1] = maior;

        System.out.println("Vetor atualizado:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        
        leitor.close();

    }
}
