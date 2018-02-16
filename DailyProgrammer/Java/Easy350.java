import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * https://www.reddit.com/r/dailyprogrammer/comments/7vm223/20180206_challenge_350_easy_bookshelf_problem/
 */
public class Easy350 {

    public static void main(String[] args) {

        // Read first line
        String firstLine = args[0];
        // Read next lines
        ArrayList<String> books = new ArrayList<>();

        for (int i = 1; i < args.length; ++i) {
            books.add(args[i]);
        }

        Scanner scanner = new Scanner(firstLine);

        // Get the total shelf values and store them in an array
        int totalShelfValue = 0;
        ArrayList<Integer> shelves = new ArrayList<Integer>();
        while (scanner.hasNextInt()) {
            int shelfValue = scanner.nextInt();
            shelves.add(shelfValue);
            totalShelfValue += shelfValue;
        }

        // Get the total book value. Just need to store in an int
        int totalBookValue = 0;
        for (String book : books) {
            scanner = new Scanner(book);
            totalBookValue += scanner.nextInt();
        }

        // The total book value is greater than the total shelf values
        if (totalBookValue > totalShelfValue) {
            System.out.println("Impossible");
            return;
        }

        // Sort shelves
        Collections.sort(shelves);

        // Starting from end of shelves, subtract the current shelf from the total book values
        // If it is 0 or less than 0, that is the number of shelves we need
        int count = 0;
        for (int i = shelves.size() - 1; i >= 0 && totalBookValue > 0; --i) {
            ++count;
            totalBookValue -= shelves.get(i);
        }

        System.out.println(count);
    }



}
