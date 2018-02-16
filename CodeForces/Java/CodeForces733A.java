import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Jeremy on 11/17/2016.
 */
public class CodeForces733A {

    public static HashSet<Character> vowels = new HashSet<Character>(Arrays.asList('a', 'A', 'e', 'E', 'i', 'I',
            'o', 'O', 'u', 'U', 'y', 'Y'));

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        int maxStep = 0;
        int currentStep = 0;
        for (int i = 0; i <= input.length(); ++i) {
            ++currentStep;

            if (i == input.length() || (i < input.length() && vowels.contains(input.charAt(i)))) {
                maxStep = (currentStep > maxStep) ? currentStep : maxStep;
                currentStep = 0;
            }
        }

        System.out.println(maxStep);
    }
}
