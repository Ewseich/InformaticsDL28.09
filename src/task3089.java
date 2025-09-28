import java.util.Scanner;
public class task3089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] mass = new int[n+1];
        int[] price = new int[n+1];
        for (int i = 1; i <= n; i++)
            mass[i] = sc.nextInt();
        for (int i = 1; i <= n; i++)
            price[i] = sc.nextInt();
        int[][] res = new int[n+1][m+1];
        for (int i = 1; i <= n; i++)
            for (int j = 0; j <= m; j++) {
                if (mass[i] <= j) res[i][j] = Math.max(res[i-1][j],res[i-1][j-mass[i]] +price[i]);
                else res[i][j] = res[i-1][j];
            }
        System.out.println(res[n][m]);
    }
}
