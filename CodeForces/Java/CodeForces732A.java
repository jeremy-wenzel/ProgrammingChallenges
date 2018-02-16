import java.util.Scanner;

/**
 * http://codeforces.com/problemset/problem/732/A
 */
public class CodeForces732A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int k = scan.nextInt();
        int r = scan.nextInt();

        int mult = 1;
        while (true) {
            int total = k * mult;
            if (total % 10 == r || total % 10 == 0) {
                System.out.println(mult);
                break;
            }
            ++mult;
        }
    }
}
