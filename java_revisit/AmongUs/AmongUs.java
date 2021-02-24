public class AmongUs{
    public static void main(String[] args) {
        Impostor joker=new Impostor("Joker",100);
        Impostor thanos=new Impostor("Thanos",70);
        Crewmate wonderwoman=new Crewmate("Wonder Woman");
        Crewmate deadpool=new Crewmate("Deadpool");
        Crewmate captain=new Crewmate("Captain America");
        Crewmate batman=new Crewmate("Batman",10);
        Player[] players={joker,thanos,wonderwoman,deadpool,captain,batman};

        //wonderwoman performs tasks
        System.out.println(wonderwoman.performTask());
        System.out.println(batman.performTask());
        //captain kills joker
        captain.emergencyMeeting(players);
        //thanos sabotages deadpool thereby decresing its suspection level
        thanos.sabotage(deadpool);
        System.out.println(wonderwoman.performTask());
        System.out.println(wonderwoman.performTask());
        System.out.println(wonderwoman.performTask());
        //thanos sabotages captain thereby decresing its suspection level
        thanos.sabotage(captain);
        System.out.println(wonderwoman.performTask());
        //thanos kills captain by calling emergency meeting
        thanos.emergencyMeeting(players);
        //thanos sabotages captain thereby decresing its suspection level futher
        thanos.sabotage(deadpool);
        thanos.sabotage(deadpool);
        //wonder women call meeting kills deadpool as it has max suspection level
        wonderwoman.emergencyMeeting(players);
        //wonderwoman kills thanos by call meeting. Hence, only wonderwoman and batman are alive, so crewmates win!
        wonderwoman.emergencyMeeting(players);
        
        System.out.println(joker+"\n"+thanos+"\n"+wonderwoman+"\n"+deadpool+"\n"+captain+"\n"+batman);



        


    }
}