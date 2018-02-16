import java.util.*;

public class Challenge288Easy {
    private static String[] commonWordsArray = {"i", "a", "about", "an", "and", "and", "are", "as", "at", "be", "by", "com", "for", "from", "how", "in",
            "is", "it", "of", "on", "or", "that", "the", "this", "to", "was", "what", "where", "who", "will", "with"};

    private static Set<String> commonWordsSet = new HashSet<String>(Arrays.asList(commonWordsArray));

    private static String testString = "For the sky and the sea, and the sea and the sky";

    public static void main(String[] args) {
        Scanner scan = new Scanner(testString);

        boolean first = true;
        String prevWord = scan.next().toLowerCase();
        ArrayList<String> strings = new ArrayList<>();

        while (scan.hasNext()) {
            String word = scan.next().toLowerCase();

            // if not a common word, compare the first letters
            if (!commonWordsSet.contains(word)) {
                // if first letters do not match
                if (prevWord.charAt(0) != word.charAt(0)) {
                    // reset
                    prevWord = word;
                    first = true;
                }
                else {
                    if (first) {
                        strings.add(prevWord);
                        first = false;
                    }
                    strings.add(word);
                }
            }

        }

        if (strings.size() > 1) {
            printList(strings);
        }
    }

    private static void printList(ArrayList<String> strings) {
        for (String str : strings) {
            System.out.print(str + " ");
        }
    }
}
