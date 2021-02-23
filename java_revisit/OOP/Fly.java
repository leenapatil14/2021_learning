public class Fly{
    private int mass;
    private double speed;

    public int getMass(){
        return this.mass;
    }
    public double getSpeed(){
        return this.speed;
    }
    public void setMass(int m){
        this.mass=m;
    }
    public void setSpeed(double s){
        this.speed=s;
    }

    Fly(int mass, double speed){
        this.mass=mass;
        this.speed=speed;
    }
    Fly(){
        this(5,10.0);
    }
    Fly(int mass){
        this(mass,10.0);
    }

    public String toString(){
        if(this.mass==0){
            return "I/’m dead, but I used to be a fly with a speed of "+this.mass+".";
        }
        else{
            return "I/’m a speedy fly with "+this.speed+" speed and "+this.mass+" mass.";
        }
    }
    public void grow(int addedmass){
        this.mass+=addedmass;
        if(this.mass<20){
            this.speed+=addedmass;
        }
        else{
            this.speed-=(addedmass*0.5);
        }
    }
    public boolean isDead(){
        return this.mass==0;
    }
    
}