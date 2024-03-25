import java.util.Scanner;
public class Ex07 {
    public void ex07(){
        Scanner leitor = new Scanner(System.in);

        int tamanho = 5;

        int vetor1[] = new int[tamanho];
        int vetor2[] = new int[tamanho];

        int i = 0;

        for(i = 0; i < tamanho ;i++){
            System.out.print("Digite o elementos do 1º vetor: ");
            vetor1[i] = leitor.nextInt();
        }
        
        for(i = 0; i < tamanho; i++){
            System.out.print("Digite o elementos do 2º vetor: ");
            vetor2[i] = leitor.nextInt();
        }

        boolean iguais  = true;
        
        for(i = 0; i < tamanho ;i++){
            if(vetor1[i] != vetor2[i]){
                iguais = false;
                break;
            }
        }

        if(iguais){
            System.out.println("Os vetroes são iguais");
        } else if(vetor1 != vetor2){
            System.out.println("Os vetores não são iguais");
        }

        
    }
}


// Faça um programa que leia dois vetores de 5 elementos cada e verifique se eles 
// são iguais ou não. Para serem iguais, todos os elementos dos dois vetores devem 
// coincidir.