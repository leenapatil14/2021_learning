public class Impostor extends Player{
    Impostor(String name,double suspect_rate){
        super(name,suspect_rate);
    }
    public void sabotage(Player c){
        if(c.getIsAlive() && this.getIsAlive()){
            if (this.getSuspect()<70){
                this.setSuspect(this.getSuspect()-10);
                c.setSuspect(c.getSuspect()+20);
            }
            else{
                this.setSuspect(this.getSuspect()-5);
                c.setSuspect(c.getSuspect()+5);
            }
        }
    }

}