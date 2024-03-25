import java.util.Scanner;
public class Ex10 {
    public void ex10() {
        Scanner leitor  = new Scanner(System.in);

        System.out.print("Informe a quantidade de núnmero: ");
        int tamanho =  leitor.nextInt();

        int A[] = new int[tamanho];
        int B[] = new int[tamanho];

        for(int i = 0; i< tamanho; i++){
            System.out.print("informe o valor de A: ");
            A[i] = leitor.nextInt();
        }
        
        for(int i = 0; i< tamanho; i++){
            B[i] = A[4 - i];
            
        }
        for(int i = 0; i< tamanho; i++){
            System.out.print(B[i] + " ");
        }

        leitor.close();
    }

}

// Crie um programa que leia um vetor A de 5 posições e, ao final da leitura, copie 
// os elementos de A em B de forma invertida. Ou seja, o primeiro elemento de A é o 
// último elemento de B, o segundo elemento de A é o penúltimo elemento de B, e assim 
// por diante.