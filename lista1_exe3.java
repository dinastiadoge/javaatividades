import java.util.Scanner;

public class lista1_exe3 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        Sc.close();
        System.out.println(SOMA(n));
    }

    public static float SOMA(int n) {
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1/ (float)(i);
        }
        return sum;
    }

}
