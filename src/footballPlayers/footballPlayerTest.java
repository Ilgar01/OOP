package footballPlayers;

public class footballPlayerTest {
    public static void main(String[] args) {
        FootballPlayer elxan = new FootballPlayer();
        elxan.no=10;
        elxan.name="Elxan";
        elxan.timeOfGame(90);
        elxan.goals();
        System.out.println(elxan.name + " "+elxan.playingTime + " deqiqedir oyundadir "+ elxan.numberOfGoals +" sayda qol atib");
    }
}
