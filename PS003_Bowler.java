

public class PS003_Bowler {
    
    private String name;
    private int wickets;
    private int matches;
    private int ballsBowled;
    private int runsConceded;

    
    public PS003_Bowler() {
        this.name = "Unknown";
        this.wickets = 0;
        this.matches = 0;
        this.ballsBowled = 0;
        this.runsConceded = 0;
    }

    
    public PS003_Bowler(String name, int wickets, int matches, int ballsBowled, int runsConceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.ballsBowled = ballsBowled;
        this.runsConceded = runsConceded;
    }

    
    public void computeBowlingAverage() {
        if (wickets == 0) {
            System.out.println("Bowling average cannot be calculated as wickets are 0.");
        } else {
            double bowlingAverage = (double) runsConceded / wickets;
            System.out.println("Bowling Average of " + name + ": " + bowlingAverage);
        }
    }

        public static void main(String[] args) {
        
        PS003_Bowler bowler1 = new PS003_Bowler();
        bowler1.computeBowlingAverage();

        
        PS003_Bowler bowler2 = new PS003_Bowler("Dev", 35, 20, 600, 800);
        bowler2.computeBowlingAverage();
    }
}