import java.util.Scanner;
public class Ex09 {
    public void ex09() {
        Scanner leitor  = new Scanner(System.in);
        
        int tamanho = 5;

        int A[] = new int[tamanho];
        int B[] = new int[tamanho];
        int C[] = new int[tamanho];

        System.out.println("Digite os valores de A:");

        for(int i = 0; i < tamanho; i++){
            System.out.print("Informe os valores [" + i + "]: ");
            A[i] = leitor.nextInt();
        }

        System.out.println("Digite os valores de B:");

        for(int i = 0; i < tamanho; i++){
            System.out.print("Informe os valores [" + i + "]: ");
            B[i] = leitor.nextInt();
        }
        
        for(int i = 0; i < tamanho; i++){
            if(i %  2 == 0){
                C[i] = B[i];
            }else{
                C[i] = A[i];
            }
        }
        
        for(int i = 0; i < tamanho; i++){
            System.out.print(C[i] + " ");
        }
        System.out.println();
    }
}

// Elabore um programa que leia os vetores A e B de 5 elementos e gere um vetor C 
// de acordo com as seguintes regras: 
 
// a. Os elementos das posições pares de C são os elementos das posições pares de A; 
// b. Os elementos das posições ímpares de C são os elementos das posições ímpares de B;
