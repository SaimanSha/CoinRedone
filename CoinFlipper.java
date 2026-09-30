class Coin {
    private String state; 
    private int heads; 
    private int tails;
    private double pTails;

    public Coin(double pt)              {pTails = pt;}
    public Coin()                       {pTails = .5;}
    public String getState()            {return "Current State: " + state;}
    public String getHeads()            {return "Heads: " + heads;} 
    public String getTails()            {return "Tails: " + tails;}
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
    public void setPTails(double p)     {pTails = p;}
    public void reset()                 {heads = 0; tails = 0;}
    public void AutoFlipper(int flips) {
        for (int i = 0; i < flips; i++) {
            flip();
        }
    }
}


// Coin@1dbd16a6