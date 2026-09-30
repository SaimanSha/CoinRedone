public class CoinTester {
    public static void main(String[] args) {
        Coin penny = new Coin();
        Coin riggedPenny = new Coin(.75); 
        System.out.println(riggedPenny.getState()); 
        penny.flip();
        System.out.println(penny.getState());
        riggedPenny.flip(99);
        System.out.println(riggedPenny.getHeads());
        System.out.println(riggedPenny.getTails());

        Coin nickel = new Coin(0.9); 
        nickel.flip(100); 
        System.out.println(nickel.getHeads()); 
        System.out.println(nickel.getTails()); 
        nickel.setPTails(.5); 
        nickel.flip(1000); 
        System.out.println(nickel.getHeads()); 
        System.out.println(nickel.getTails());

        Player Salmon = new Player(100); 
        Salmon.flip (penny, "tails", 50); 
        System.out.println(Salmon.getBalance());
    }
}