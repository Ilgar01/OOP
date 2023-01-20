package footballPlayers;

public class FootballPlayer {

        int no;
        String name;
        int playingTime;
        int numberOfGoals;
        void timeOfGame(int time){
            playingTime = playingTime+time;

        }
        void goals(){
            numberOfGoals++;
        }

    }


