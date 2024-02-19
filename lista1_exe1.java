import java.util.*;

public class lista1_exe1 {
    public static void main(String[] args) {
        boolean isValid = false;
        int i = 0, entrada, repeticoes = 0;
        Scanner sc = new Scanner(System.in);

        while (!isValid) {
            System.out.println("Digite um número inteiro positivo maior que 1: ");
            i = sc.nextInt();
            System.out.println("Digite o número de repetições: (0-x)");
            repeticoes = sc.nextInt();
            if (i > 1 & repeticoes >= 0)
                isValid = true;
        }
        if (isValid) {
            sc.close();
            entrada = i;
            for (int k = 0; k < repeticoes; k++) {
                if (k % 2 == 0) {
                    System.out.println("");
                    for (int j = 0; j <= entrada; j++) {
                        System.out.print(j + " ");
                    }
                } else {
                    System.out.println("");
                    for (int j = entrada; j > -1; j--) {
                        System.out.print(j + " ");
                    }
                }
            }
        }
    }
}