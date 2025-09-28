import java.util.ArrayList;
import java.util.Scanner;
public class task3090 {
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
        int[][] way = new int[n+1][m+1];
        int[] path = new int[n];
        int l = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (mass[i] <= j) {
                    if (res[i-1][j] >= res[i-1][j-mass[i]] +price[i]) {
                        res[i][j] = res[i-1][j];
                    }
                    else {
                        res[i][j] = res[i-1][j-mass[i]] +price[i];
                        way[i][j] = 1;
                    }
//                    res[i][j] = Math.max(res[i - 1][j], res[i - 1][j - mass[i]] + price[i]);
                } else res[i][j] = res[i - 1][j];
            }

        }
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= m; j++) {
//                System.out.print(res[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= m; j++) {
//                System.out.print(way[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
        int j = m;
        for (int i = n; i > 0; i--) {
            if (way[i][j] == 1) {
                path[l] = i;
                j -= mass[i];
                l++;
            }
        }
        for (int i = n-1; i >= 0; i--) {
            if (path[i] != 0) System.out.println(path[i]);
        }


    }
}
