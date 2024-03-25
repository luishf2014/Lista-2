import java.util.Scanner;
public class Ex03 {
    public void ex03() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de números: ");
        int tamanho = leitor.nextInt();

        int vetor[] = new int[tamanho];

        System.out.println("Vetor primário");
        for(int i = 0; i < tamanho; i++){
            System.out.print("Número [" + i + "]: ");
            vetor[i] = leitor.nextInt();
        }

        System.out.println("Vetor segundário");
        for(int i = 0; i < tamanho; i++){
            System.out.println("Número [" + i + "]: " + (vetor[i] * 2));
        }

        leitor.close();


    }
}
