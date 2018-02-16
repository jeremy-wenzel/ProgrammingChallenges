import java.util.Scanner;

/**
 * Problem found at http://codeforces.com/problemset/problem/731/A
 */
public class CodeForces731A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.next();
        char currentLetter = 'a';
        int sum = 0;

        for(int i = 0; i < word.length(); ++i) {
            int length = Math.abs(word.charAt(i) - currentLetter);

            if (length > 13) {
                length = 26 - length;
            }
            sum += length;

            currentLetter = word.charAt(i);
        }

        System.out.println(sum);
    }
}
