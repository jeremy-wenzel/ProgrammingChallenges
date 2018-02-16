import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by Jeremy on 11/30/2016.
 */
public class CodeForces730A {

    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
//        Scanner scan = new Scanner(System.in);
        FastScanner in = new FastScanner(System.in);
        int numFriends = in.nextInt();
        int[] skillz = new int[numFriends];

        for (int i = 0; i < numFriends; ++i) {
            skillz[i] = in.nextInt();
        }

        ArrayList<boolean[]> matches = new ArrayList<>(10000);
        boolean[] playing = new boolean[numFriends];
        // make sure skills are correct
        while (!isValid(skillz)) {
            clearArray(playing);
            int totalPlaying = 0;
            boolean addMorePlayers = true;

            // While we don't have between 2 and 5 players
            while (addMorePlayers) {
                int maxPlayerIndex = -1;
                int maxPlayerSkill = -1;
                for (int i = 0; i < numFriends; ++i) {
                    if (!playing[i] && skillz[i] >= maxPlayerSkill) {
                        maxPlayerIndex = i;
                        maxPlayerSkill = skillz[i];

                    }
                }
                // find max non-player friend
//                for (int i = 1; i < numFriends; ++i) {
//                    if (!playing[i] && skillz[i] >= skillz[maxPlayerIndex]) {
//                        maxPlayerIndex = i;
//                    }
//                }



                // They are now playing
                playing[maxPlayerIndex] = true;
                ++totalPlaying;

                // If we have 5, we are good to go
                if (totalPlaying >= 2) {
                    addMorePlayers = false;
                }
                else {
                    for (int i = 0; i < numFriends; ++i) {
                        if (!playing[i] && skillz[i] == skillz[maxPlayerIndex]) {
                            if (totalPlaying == 5){
                                totalPlaying--;
                                playing[maxPlayerIndex] = false;
                                break;
                            }
                            totalPlaying++;
                            playing[i] = true;

                        }
                    }
                    if (totalPlaying >= 2)
                        addMorePlayers = false;
                }
                // Otherwise we continue
            }

            // Subtract the skills
            for (int i = 0; i < playing.length; ++i) {
                if (playing[i] && skillz[i] > 0) {
                    --skillz[i];
                }
            }

            // Add the match to the total matches
            matches.add(playing.clone());
        }
        out.println(skillz[0]);
        out.println(matches.size());

        for (int i = 0; i < matches.size(); ++i) {
            printMatch(matches.get(i));
        }
        out.close();
    }

    public static boolean isValid(int[] skillz) {
        int skill = skillz[0];

        for (int i = 1; i < skillz.length; ++i) {
            if (skillz[i] != skill) {
                return false;
            }
        }

        return true;
    }

    public static void printMatch(boolean[] match) {
        for (int i = 0; i < match.length; ++i) {
            int num = match[i] ? 1 : 0;
            out.print(num);
        }
        out.println();
    }

    public static void clearArray(boolean[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = false;
        }
    }
}
class FastScanner
{
    BufferedReader br;
    StringTokenizer st;
    public FastScanner(InputStream in)
    {
        br = new BufferedReader(new InputStreamReader(in));
        st = new StringTokenizer("");
    }
    public String next() throws IOException
    {
        while(!st.hasMoreElements()) st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }
    public int nextInt() throws IOException
    {
        return Integer.parseInt(next());
    }
    public void close() throws IOException
    {
        br.close();
    }
}
