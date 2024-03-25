import java.util.Scanner;
import java.util.StringJoiner;

public class Ex08 {
    public void ex08() {
        Scanner leitor = new Scanner(System.in);

        int tamanho = 5;

        int A[] = new int[tamanho];
        int B[] = new int[tamanho];

        for(int i = 0; i < tamanho; i++){
            System.out.print("Informe os valores do 1º vetor: ");
            A[i] = leitor.nextInt();
        }

        for(int i = 0; i < tamanho; i++){
            System.out.print("Informe os valores do 2º vetor: ");
            B[i] = leitor.nextInt();
        }

        StringJoiner joiner = new StringJoiner(", ");
        for (int num : A) {
            joiner.add(String.valueOf(num));
        }
        for (int num : B) {
            joiner.add(String.valueOf(num));
        }

        // Exibindo a string concatenada
        System.out.println(joiner.toString());

        leitor.close();
    }
}


// Dados dois vetores A e B de 5 elementos cada, criar um vetor C que representa a 
// concatenação de A e B, ou seja, C contém os elementos de A seguidos dos elementos 
// de B.