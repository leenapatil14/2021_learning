public class Farm{
    public static void main(String [] args) {
        Eagle golden=new Eagle();
        Eagle harpy=new Eagle(12,40);
        Eagle bald=new Eagle(3.2,5);
        System.out.println(harpy);

        Snake ripple=new Snake(100,13);
        Snake python=new Snake(60);
        
        
        bald.eat(ripple);
        //have bald eagle eat ripple snake (the snake won't be killed as it's venom is more powerful)
        System.out.println(ripple);
        //increase harpy eagle's mass 
        harpy.grow(8);
        //have harpy kill ripple (snak is killed)
        harpy.eat(ripple);
        System.out.println(ripple);
        System.out.println(harpy);
        //increase age of golden eagle by 1
        golden.grow();
        System.out.println(golden);
        
    }
}