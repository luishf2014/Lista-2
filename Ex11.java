import java.util.Scanner;

public class Ex11 {
    public void ex11() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("informe o tamnaho dos vestores: ");
        int tamanho = leitor.nextInt();

        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];

        for(int i = 0; i < tamanho; i++){
            System.out.print("Informe o valor do vetor A: ");
            vetorA[i] = leitor.nextInt();
        }

        for(int i = 0; i < tamanho; i++){
            System.out.print("Informe o valor do vetor B: ");
            vetorB[i] = leitor.nextInt();
        }

        int produto = calcular(vetorA, vetorB);

        System.out.println("Produto escalar: " + produto);

        leitor.close();
    }

    public static int calcular(int[] A, int[] B){
        int produto = 0;

        if (A.length != B.length){
            System.out.println("Os vetores devem ter o mesmo tamanho");
            return -1;
        }

        for(int i = 0; i < A.length; i++){
            produto += A[i] * B[i];
        }

        return produto;
    }
}