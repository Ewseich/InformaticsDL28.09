import java.util.Scanner;
public class task1121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }
        int[] res = new int[s+1];
        res[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int k = s; k >= m[i]; k--) {
                if (res[k - m[i]] != 0 && res[k] == 0) res[k] = res[k - m[i]] + 1;
                else if (res[k - m[i]] != 0) res[k] = Math.min(res[k - m[i]] + 1, res[k]);
            }
        }
        if (res[s] != 0) System.out.println(res[s]-1);
        else System.out.println(res[s]);
    }
}