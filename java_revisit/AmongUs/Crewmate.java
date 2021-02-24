public class Crewmate extends Player {
    private int numTasks;

    public void setNumTasks(int tasks){
        this.numTasks=tasks;
    }
    public int getNumTasks(){
        return this.numTasks;
    }

    Crewmate(String name,double suspect_rate){
        super(name,suspect_rate);
        setNumTasks(5);
    }
    Crewmate(String name){
        super(name);
        setNumTasks(5);
    }

    //perform tasks
    public String performTask(){
        if(this.getIsAlive()){
            this.numTasks-=1;
            if (this.numTasks==0){
                return this.getName()+" Completed All Tasks";
            }
            else{
                this.setSuspect(this.getSuspect()-10);
                return this.getName()+" completed "+(5-numTasks)+" Tasks";
            }
        }
        return this.getName()+" is dead!";
        
    }
}