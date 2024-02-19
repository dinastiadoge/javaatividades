import java.util.*;

public class lista1_exe2 {
    public static int entrada;

    public static void main(String[] args) {

        System.out.println("Digite um número positivo maior que 0:");
        Scanner sc = new Scanner(System.in);
        entrada = sc.nextInt();
        sc.close();
        fibonacci(entrada);
    }

    public static void fibonacci(int entrada) {
        int nmr_Anterior = 0, nmr_Atual = 0, soma = 1, j;
        for (j = 0; j < entrada; j++) {
            if (j == 0) {
                System.out.print(1 + " ");
            } else {
                nmr_Anterior = nmr_Atual;
                nmr_Atual = soma;
                soma = nmr_Anterior + nmr_Atual;
                System.out.print(soma + " ");
            }
        }
    }
}
