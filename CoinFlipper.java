class Coin {
    private String state; 
    private int heads; 
    private int tails;
    private double pTails;

    public Coin(double pt) {pTails = pt;}
    public Coin() {pTails = .5;}
    public String getState() {return state;}
    public int getHead() {return heads;} 
    public int getTails() {return tails;}
    public void flip() { 
        if (Math.random() < pTails) {
            state = "tails"; 
            tails++;
        } else { 
            state = "heads";
            heads++;
        } 
    }
    public void flip(int flips) {
        while (flips > 0) {
            flip();
            flips--;
        }
    }
}

public class CoinFlipper {
    public static void main(String[] args) {
        Coin penny = new Coin();
        Coin riggedPenny = new Coin(.75); 
        System.out.println(riggedPenny.getState()); 
        penny.flip();
        System.out.println(penny.getState());
        riggedPenny.flip(99);
        System.out.println("Heads: " + riggedPenny.getHead());
        System.out.println("Tails: " + riggedPenny.getTails());
    }
}


// Coin@1dbd16a6