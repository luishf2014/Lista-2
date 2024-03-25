import java.util.Scanner;

public class Ex13 {
    public void ex13() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de termos da sequência de Fibonacci desejados: ");
        int n = scanner.nextInt();

        int[] Fibonacci = sequenciaF(n);

        System.out.println("Os " + n + " primeiros termos da sequência de Fibonacci são:");
        
        // ":" indica que estamos percorrendo os elementos do array vetor.
        for (int num : Fibonacci) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }

    public static int[] sequenciaF(int n) {
        int[] fibonacci = new int[n];

        if (n >= 1) {
            fibonacci[0] = 1;
        }if (n >= 2) {
            fibonacci[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }
}
