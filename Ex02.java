import java.util.Scanner;
public class Ex02 {
    public void ex02(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a quantidade de números: ");
        int tamanho = leitor.nextInt();

        int vetor[] = new int[tamanho];

        for(int i = 0; i < tamanho; i++){
            System.out.print("Número [" + i + "]: ");
            vetor[i] = leitor.nextInt();
        }
        for(int i = 0; i < tamanho; i++){
            if(vetor[i] > 0){
                System.out.println("[" + i + "] --> " + vetor[i] + " (POSITIVO)");
            }else if(vetor[i] < 0){
                System.out.println("[" + i + "] --> " + vetor[i] + " (NEGATIVO)");
            }else{
                System.out.println("[" + i + "] --> " + vetor[i] + " (IGUAL A ZERO)");
            }        
        }

        leitor.close();
    }

}
