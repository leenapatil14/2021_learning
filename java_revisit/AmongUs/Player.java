public class Player{
    private String name;
    private double suspect_rate;
    private boolean isAlive;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setSuspect(double rate){
        this.suspect_rate=rate;
    }
    public double getSuspect(){
        return this.suspect_rate;
    }
    public void setIsAlive(boolean isAlive){
        this.isAlive=isAlive;
    }
    public boolean getIsAlive(){
        return this.isAlive;
    }

    Player(String name,double rate){
        setName(name);
        setSuspect(rate);
        setIsAlive(true);
    }
    Player(String name){
        this(name,50);
    }
    Player(){
        this("unnamed",50);
    }

    //kill a player if both current player and player c are alive
    public void kill(Player c){
        if(c.getIsAlive() && this.getIsAlive()){
            c.setIsAlive(false);
        }
        // System.out.println(c+" killed");
    }

    //compare objects
    public boolean equals(Player p){
        return this.name==p.name && this.suspect_rate==p.suspect_rate;
    }
    
    //hold emergency meeting
    public void emergencyMeeting(Player[] players){
        if(this.getIsAlive()){
            double max_=-1;
            Player tokill=null;
            //get and kill player with maximum suspection level
            for(Player p: players){
                if(!p.equals(this) && p.getIsAlive() && p.getSuspect()>max_){
                    max_=p.getSuspect();
                    tokill=p;
                    
                }
            }
            this.kill(tokill);
            //check if game is over
            finish(players);
        }
    }

    //check if game is over
    private void finish(Player[] players){
        int deadImpostors=0;
        int deadCrewmates=0;
        int totalCrewmates=0;
        int totalImpostors=0;
        for(Player p:players){
            if(p instanceof Crewmate){
                if(!p.getIsAlive())
                    deadCrewmates+=1;
                totalCrewmates+=1;
            } 
                
            else if(p instanceof Impostor){
                if(!p.getIsAlive())
                    deadImpostors+=1;
                totalImpostors+=1;
            }
        }
        //System.out.println("Crewmates " + deadCrewmates+" "+totalCrewmates);
        // System.out.println("Impostors " + deadImpostors+" "+totalImpostors);
        if(deadCrewmates==totalCrewmates){
            System.out.println("Impostors Win!");
            System.exit(0);
        }
        else if (deadImpostors==totalImpostors){
            System.out.println("Crewmates Win!");
            System.exit(0);
        }
        


    }
    public String toString(){
        if(this.isAlive){
            return this.name+" with "+this.suspect_rate+" suspect rate. I am alive ";
        }
        return this.name+" with "+this.suspect_rate+" suspect rate. I am dead ";
    }
}