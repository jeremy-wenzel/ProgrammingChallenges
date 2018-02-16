import java.util.Scanner;

/**
 * Challenge taken from https://www.reddit.com/r/dailyprogrammer/comments/5bn0b7/20161107_challenge_291_easy_goldilocks_bear/.
 *
 * These are starting to get way to easy so it may be time to start doing some intermediates now
 */
public class Challenge291Easy {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int weight = scan.nextInt();
        int editableTemp = scan.nextInt();
        int index = 1;

        while (scan.hasNext()) {
            int chairWeight = scan.nextInt();
            int temp = scan.nextInt();

            if (chairWeight >= weight && temp <= editableTemp) {
                System.out.print(index + " ");
            }
            ++index;
        }
    }
}
