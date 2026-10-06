public class Player {
    private int balance;
    public Player(int b) {balance = b;}
    public int getBalance() {return balance;}
    public boolean cooked = balance <= 0;

    public boolean flip(Coin c, String guess, int risk) {
        c.flip(); 
        if (c.getState().equals(guess)) {
            balance += risk;
            return true;
        } else {
            balance -= risk;
            return false;
        }
    }
}
