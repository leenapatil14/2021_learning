public class Eagle{
    private int age;
    private double speed;

    
    Eagle(){
        this(1,5);
    }

    Eagle(int age, double speed){
        this.age=age;
        this.speed=speed;
    }
    
    Eagle(double age_y, double speed){
        this.age=(int)age_y*12;
        this.speed=speed;
    }

    //custom toString to display object on sys out
    public String toString(){
        return "I’m "+this.age+" months old eagle and have a speed of "+this.speed+".";
    }
    // update the age by inc months. If age exceeds 12 decrease the speed else otherwise
    private void updateAge(int inc){
        this.age+=inc;
        if(this.age<12){
            this.speed+=inc;
        }
        else{
            this.speed-=(inc);
        }
    }
 
    public void grow(int months){
        
        updateAge(months);
        
    }
    //overloading above method with 0 arguments
    public void grow(){
        updateAge(1);
    }
    //return if snake is already dead, else, check if eagle's speed > snake's venom power and kill the snake.
    //Otherwise increse snakes mass by 10
    public void eat(Snake snake){
        if(snake.isDead()){
            return;
        }
        else{
            if(snake.getVenomPower()<this.speed){
                snake.setMass(0);
                this.grow();
            }
            else{
                snake.setMass(snake.getMass()+10);
            }
        }
    }
    
}