public class Farm{
    public static void main(String [] args) {
        Eagle golden=new Eagle();
        Eagle harpy=new Eagle(12,40);
        Eagle bald=new Eagle(3.2,5);
        System.out.println(harpy);

        Snake ripple=new Snake(100,13);
        Snake python=new Snake(60);
        
        
        bald.eat(ripple);
        System.out.println(ripple);
        harpy.grow(8);
        harpy.eat(ripple);
        System.out.println(ripple);
        System.out.println(harpy);
        golden.grow();
        System.out.println(golden);
        
    }
}