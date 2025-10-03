import java.util.Scanner;
public class task3092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
            sum += m[i];
        }
        if (sum % 2 == 1) System.out.println("NO");
        else {
            int[] res = new int[sum/2+1];
            res[0] = 1;
            for (int i = 0; i < n; i++) {
                for (int j = sum/2; j >= m[i]; j--) {
                    if (res[j-m[i]] != 0) res[j]++;
                }
            }
            if (res[sum/2] >= 2) System.out.println("YES");
        }

    }
}
