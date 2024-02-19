import java.util.Scanner;

public class Lista1_exe4 {
    static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {
        int matriz[][] = InserirMatriz();
        ImprimirMatriz(MontarTransposta(matriz));
        Sc
    }

    public static int[][] InserirMatriz() {
        int a, b;

        System.out.println("Digite o número de linhas da matriz: ");
        a = Sc.nextInt();
        System.out.println("Digite o número de colunas da matriz: ");
        b = Sc.nextInt();

        int matriz[][] = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("Digite o valor na posição [" + i + "][" + j + "]: ");
                matriz[i][j] = Sc.nextInt();
            }
        }
        return matriz;
    }
    public static int[][] MontarTransposta(int matriz[][]){

        int transposta[][] = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < transposta.length; i++) {
            for (int j = 0; j < transposta[0].length; j++) {
                transposta[i][j] = matriz[j][i];
            }
        }
        return transposta;
    }

    public static void ImprimirMatriz(int matriz[][]){
        int col = matriz[0].length;
        for (int i = 0; i < matriz.length ; i++) {

            for (int j = 0; j < col; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println("");
        }
    }
}
