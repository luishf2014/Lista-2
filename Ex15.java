import java.util.Scanner;

public class Ex15 {
    public void ex15() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = leitor.nextInt();

        int vetor[] = new int[tamanho];

        // Leitura do primeiro número
        System.out.print("Informe o primeiro número: ");
        vetor[0] = leitor.nextInt();

        for (int i = 1; i < tamanho; i++) {
            System.out.print("Informe o próximo número (deve ser maior que " + vetor[i - 1] + "): ");
            
            int num = leitor.nextInt();
            
            if (num > vetor[i - 1]) {
                vetor[i] = num;
            } else {
                System.out.println("O número digitado não é maior que o anterior. Tente novamente.");
                i--; // Decrementa o contador para tentar novamente o mesmo índice
            }
        }

        System.out.println("Vetor preenchido:");

        // Exibindo o vetor preenchido
        // ":" indica que estamos percorrendo os elementos do array vetor.
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        leitor.close();
    }
}


// Elabore um algoritmo que leia 5 números do teclado e preencha um vetor de 
// acordo com a seguinte regra: com exceção do 1º número, só é permitido armazenar 
// um número se ele for maior que o anterior. Ex.: se o primeiro valor lido for 5, o próximo 
// valor lido só poderá ser maior que 5.