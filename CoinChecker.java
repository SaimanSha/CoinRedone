import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CoinChecker {
    public static void main(String[] args) throws FileNotFoundException{
        // boolean shutter = true;
        int heads = 0;
        int tails = 0;
        int fileSize = 97; // Find a way to get the file size of the text file and store it in this variable

        Scanner scanner = new Scanner(new File("flips.txt"));
        for (int i = 0; i < fileSize; i++) {
            String side = scanner.nextLine();
            if (side.equals("heads")) {
                heads++;
            } else if (side.equals("tails")) {
                tails++;
            }
        }
        scanner.close();
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
    }
}
