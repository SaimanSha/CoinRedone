import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CoinChecker {
    public static void main(String[] args) throws FileNotFoundException{
        // boolean shutter = true;
        int heads = 0;
        int tails = 0;
        int fileSize = 97; // Find a way to get the file size of the text file and store it in this variable

        Scanner scanner = new Scanner(new File("flips.txt")); // code I wrote by myself
        for (int i = 0; i < fileSize; i++) {
            String side = scanner.nextLine();
            if (side.equals("heads")) {
                heads++;
            } else if (side.equals("tails")) {
                tails++;
            }
        }

        //while (scanner.hasNext()) { if (scanner.next().equals("heads")) heads++; else tails++;}

        scanner.close();
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
        double se = standardError(0.5, 97); 
        System.out.println(se); 
        double pHat = (double) tails / (heads + tails); 
        System.out.println(pHat);
        double z = (pHat - 0.5) / se; 
        System.out.println(z);

        System.out.println(simulate(97, "tails", pHat, 2 * pHat - 1));
    }

    public static int simulate(int flips, String guess, double tails, double risk) {
    Player p = new Player(100); 
    Coin c = new Coin(tails); 
    while (flips > 0) {
        p.flip(c, guess, (int)(risk * p.getBalance() + 0.5));
    } 
    return p.getBalance();}

    public static double standardError(double p, int sample) {return Math.sqrt(p * (1 - p) / sample);}
    public static double pHat(int heads, int tails) {return (double) tails / (heads + tails);}
}



