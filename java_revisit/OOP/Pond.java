public class Pond{
    public static void main(String [] args) {
        Frog peepo=new Frog("Peepo");
        Frog pepe=new Frog("Pepe",10,15);
        Frog peepaw=new Frog("Peepaw",4.6,5);
        System.out.println(peepo);

        Fly f1=new Fly(1,13);
        Fly f2=new Fly(6);
        
        peepaw.species="1331 Frogs";
        peepo.eat(f2);
        System.out.println(f2);
        pepe.grow(8);
        pepe.eat(f2);
        System.out.println(f2);
        System.out.println(pepe);
        peepaw.grow(4);
        System.out.println(peepaw+"\n"+pepe);
        
    }
}