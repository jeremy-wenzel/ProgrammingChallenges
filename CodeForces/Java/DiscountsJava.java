import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * I wrote this because I was having issues with the kotlin version. I found out it was
 * the println implementation which was slowing things down.
 */
public class DiscountsJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = scanner.nextInt();
        long[] bars = new long[n];
        long totalCost = 0;
        for (int i = 0; i < n; ++i) {
            bars[i] = scanner.nextLong();
            totalCost += bars[i];
        }

        Arrays.sort(bars);
        int m = scanner.nextInt();
        for (int i = 0; i < m; ++i) {
            int coupon = scanner.nextInt();
            out.println(totalCost - bars[bars.length - coupon]);
        }
        out.flush();
    }
}
