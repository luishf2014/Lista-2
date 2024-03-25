import java.util.Scanner;
public class Ex06 {
    public void ex06() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("informe a quantidade de notas: ");
        int tamanho = leitor.nextInt();

        int notas[] =  new int[tamanho];
        int pesos[] = new int[tamanho];

               
        for(int i = 0; i < tamanho; i++){
            System.out.print("Informe as notas: ");
            notas[i] = leitor.nextInt();
        }

        for(int i = 0; i < tamanho; i++){
            System.out.print("Informe o peso das notas: ");
            pesos[i] = leitor.nextInt();
            
        }

        double somaNota = 0;
        double somaPeso = 0;

        for(int i = 0; i < tamanho; i++){
            somaNota +=  notas[i] * pesos[i];
            somaPeso += pesos[i];
        }

        Double media = somaNota / somaPeso;

        System.out.println("A média ponderada é: " + media);

        
    }
}


// Elabore um programa que leia um vetor com 5 notas de um aluno e um outro vetor 
// com 5 pesos e calcule a média ponderada do aluno.  
// Média ponderada = nota1 * peso1 + nota2 * peso2 + nota3 * peso3 
// peso1 + peso2 + peso3 
 
// Ex.: notas: 7.5, 9.2 pesos: 6, 4. Média ponderada: (7.5 * 6 + 9.2 * 4) / (6 + 4)