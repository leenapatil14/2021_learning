public class Snake{
    private int mass;
    private double venomPower;

    public int getMass(){
        return this.mass;
    }
    public double getVenomPower(){
        return this.venomPower;
    }
    public void setMass(int m){
        this.mass=m;
    }
    public void setVenomPower(double s){
        this.venomPower=s;
    }

    Snake(int mass, double venomPower){
        this.mass=mass;
        this.venomPower=venomPower;
    }
    //Constructor chaining
    Snake(){
        this(50,10.0);
    }
    Snake(int mass){
        this(mass,10.0);
    }

    public String toString(){
        if(this.mass==0){
            return "I/’m dead, but I used to have venom power of "+this.venomPower+".";
        }
        else{
            return "I/’m a poisonous with "+this.venomPower+" of venom and "+this.mass+" mass.";
        }
    }
    //increase snake's mass and change venom power accordingly
    public void grow(int addedmass){
        this.mass+=addedmass;
        if(this.mass>100){
            this.venomPower+=addedmass;
        }
        else{
            this.venomPower-=(addedmass);
        }
    }
    //check if snake is dead
    public boolean isDead(){
        return this.mass==0;
    }
    
}