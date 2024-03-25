import java.util.Scanner;
public class Ex05 {
    public void ex05(){
        Scanner leitor = new Scanner(System.in);

        int vetor[] = new int[5];

        for(int i = 0; i < vetor.length; i++){
            System.out.print("Informe os números [" + i + "]: ");
            vetor[i] = leitor.nextInt();
        }

        System.out.println("Qual número você quer ver, que se repete?");
        int n = leitor.nextInt();

        int cont = 0;

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == n){
                cont++;
            }
        }

        System.out.println("o número " + n + " apareceu "+ cont + " vez(es)");

        leitor.close();
    }
}
// Elabore um programa que leia 5 números do teclado e os armazene em um vetor. 
// Em seguida, leia um número n qualquer e apresente na tela a quantidade de vezes 
// que o número n aparece no veto