import java.util.Scanner;
public class Ex01 {
    public void ex01(){
        Scanner leitor =  new Scanner (System.in); 
        
        
        int v[] = new int[5];
        int soma = 0;

        for (int i = 0; i < v.length; i++){
            System.out.print("Digite os valores [" + i + "]: ");
            v[i] = leitor.nextInt();
            soma += v[i];
            
        }
        
        System.out.println("A soma é: " + soma);
        Double media = (double)soma / v.length;

        System.out.println("A média das notas são: " + media);

        for (int i = 0; i < v.length; i++) {
            if (v[i] < media) {
                System.out.println("O valor [" + i + "] : " + v[i] + " é menor a média");
                
            }
        }
        for (int i = 0; i < v.length; i++){
            if( v[i] == media ){ 
                System.out.println("O valor [" + i + "] : " + v[i] + " é igual a média");
                
            }
        }
        for (int i = 0; i < v.length; i++){
            if( v[i] > media ){ 
                System.out.println("O valor [" + i + "] : " + v[i] + " é maior a média");
                
            }
        }
        leitor.close();
    }   
}