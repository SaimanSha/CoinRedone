import java.util.Scanner;

public class Game {
    private Coin coin;
    private Player player;
    public Game() {
        player = new Player(100); 
        coin = new Coin(Math.random()); 
        System.out.println("Your initial balance is 100");
    }
    public void play() {
        Scanner s = new Scanner(System.in); 
        System.out.println("How much would you like to risk?"); 
        int risk = s.nextInt(); 
        System.out.println("Heads or Tails?"); 
        String guess = s.next().toLowerCase();
        boolean correct = player.flip(coin, guess, risk);
        if (correct) {
            System.out.println("You guessed correctly! Your new balance is: " + player.getBalance());
        } else {
            System.out.println("You guessed incorrectly. Your new balance is: " + player.getBalance());
        }
        play();
        s.close();
    }
}
