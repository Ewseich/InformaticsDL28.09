import java.util.Scanner;
public class task1119 {
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
            for (int k = s; k >= m[i]; k--)
                if (res[k-m[i]] == 1) res[k] = 1;
        }
        int a = s;
        while (res[a] == 0) {
            a--;
        }
        System.out.println(a);
    }
}