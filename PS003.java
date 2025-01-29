

public class PS003 {
    
    private String name;
    private int wickets;
    private int matches;
    private int ballsBowled;
    private int runsConceded;

    
    public PS003() {
        this.name = "Unknown";
        this.wickets = 0;
        this.matches = 0;
        this.ballsBowled = 0;
        this.runsConceded = 0;
    }

    
    public PS003(String name, int wickets, int matches, int ballsBowled, int runsConceded) {
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
        
        PS003 bowler1 = new PS003();
        bowler1.computeBowlingAverage();

        
        PS003 bowler2 = new PS003("Dev", 35, 20, 600, 800);
        bowler2.computeBowlingAverage();
    }
}