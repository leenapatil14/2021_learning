public class AmongUs{
    public static void main(String[] args) {
        Impostor joker=new Impostor("Joker",100);
        Impostor thanos=new Impostor("Thanos",70);
        Crewmate wonderwoman=new Crewmate("Wonder Woman");
        Crewmate deadpool=new Crewmate("Deadpool");
        Crewmate captain=new Crewmate("Captain America");
        Crewmate batman=new Crewmate("Batman");
        Player[] players={joker,thanos,wonderwoman,deadpool,captain,batman};

        System.out.println(wonderwoman.performTask());
        thanos.kill(batman);
        captain.emergencyMeeting(players);
        thanos.sabotage(deadpool);
        System.out.println(wonderwoman.performTask());
        System.out.println(wonderwoman.performTask());
        System.out.println(wonderwoman.performTask());
        thanos.sabotage(captain);
        System.out.println(wonderwoman.performTask());
        thanos.emergencyMeeting(players);
        thanos.sabotage(deadpool);
        thanos.sabotage(deadpool);
        
        wonderwoman.emergencyMeeting(players);
        wonderwoman.emergencyMeeting(players);
        System.out.println(joker+"\n"+thanos+"\n"+wonderwoman+"\n"+deadpool+"\n"+captain+"\n"+batman);



        


    }
}