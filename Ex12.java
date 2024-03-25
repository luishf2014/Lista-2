import java.util.Scanner;

public class Ex12 {
    public void ex12() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("informe o tamnaho dos vestores: ");
        int tamanho = leitor.nextInt();

        int vetor[] = new int[tamanho];

        for(int i = 0; i < tamanho ; i++){
            System.out.print("Digite o elementos do 1º vetor: ");
            vetor[i] = leitor.nextInt();
        }

        int pares = calcular(vetor);

        if (pares == 1) {
            System.out.println("Não existem elementos pares positivos.");
        } else {
            System.out.println("O produto dos elementos pares positivos é: " + pares);
        }

        leitor.close();

    }
    
    public static int calcular(int[] vetor){
        int produto = 1;

        boolean iguais  = false;

        // ":" indica que estamos percorrendo os elementos do array vetor.
        for(int num : vetor){
            if (num != 0 && num % 2 == 0 && num > 0){
                produto *= num;
                iguais = true;
            }
        }

        
        if (iguais) {
            return produto;
        } else {
            return 1;
        }
        
    }

}

// Elabore um programa que leia um vetor de 12 elementos apresente na tela o 
// produto dos elementos pares positivos (desconsiderar o zero). Exemplo: {0, 5, 8, 1, -
// 6, 4, -7, 9, 10, -14, 3, 12} = 5 * 8 * 1 * 4 * 9 * 10 * 3 * 12 = 3840