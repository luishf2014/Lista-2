
import java.util.Scanner;
public class Ex04 {
    public void ex04() {
        Scanner leitor = new Scanner(System.in);

       System.out.print("Informe o tamanho  do vetor: ");
        int tamanho = leitor.nextInt();

        int vetor[] = new int[tamanho];

        System.out.println("Informe os valores do vetor");

        

        for(int i = 0; i < tamanho; i++){
            System.out.print("Indice [" + i + "]: ");
            vetor[i] = leitor.nextInt();
        }

        System.out.print("Digite um número n: ");
        int n = leitor.nextInt();

        
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] <= n) {
                System.out.println("Índice [" + i + "]: " + vetor[i] + " é menor que número n");
            }
        }        
        
        leitor.close();
    }
}
