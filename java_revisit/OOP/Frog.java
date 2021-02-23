public class Frog{
    private String name;
    private int age;
    private double tongueSpeed;
    private boolean isFroglet;
    static String species="Rare Pepe"; 

    
    Frog(String name){
        this(name,5,5);
        this.isFroglet=true;
    }

    Frog(String name, int age, double tongueSpeed){
        this.name=name;
        this.age=age;
        if(age<=7){
            this.isFroglet=true;
        }
        else{
            this.isFroglet=false;
        }
        this.tongueSpeed=tongueSpeed;
    }
    
    Frog(String name, double age_y, double tongueSpeed){
        this.name=name;
        this.age=(int)age_y*12;
        if(age<=7){
            this.isFroglet=true;
        }
        else{
            this.isFroglet=false;
        }
        this.tongueSpeed=tongueSpeed;
    }


    public String toString(){
        if(this.isFroglet){
            return "My name is "+this.name+" and I\'m a rare froglet! I’m "+this.age+" months old and my tongue has a speed of "+this.tongueSpeed+".";
        }
        else{
            return "My name is "+this.name+" and I\'m a rare frog! I’m "+this.age+" months old and my tongue has a speed of "+this.tongueSpeed+".";
        }
    }
    private void updateAge(int inc){
        this.age+=inc;
        setFroglet();
        if(this.age<12){
            
            this.tongueSpeed+=inc;
        }
        else if(this.age>=30){
            if (this.tongueSpeed-inc>5){
                this.tongueSpeed-=(inc);
            }
            else{
                this.tongueSpeed=5;
            }
            
        }
    }
    private void setFroglet(){
        if(this.age<=7){
            this.isFroglet=true;
        }
        else{
            this.isFroglet=false;
        }
    }
    public void grow(int months){
        
        updateAge(months);
        
    }

    public void grow(){
        updateAge(1);
    }
    
    public void eat(Fly fly){
        if(fly.isDead()){
            return;
        }
        else{
            if(fly.getSpeed()<this.tongueSpeed){
                fly.setMass(0);
                if(fly.getMass()<(0.5*this.age)){
                    this.grow(1);
                }
            }
            else{
                fly.setMass(fly.getMass()+1);
            }
        }
    }
    
}