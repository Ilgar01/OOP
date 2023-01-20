package movies;

public class Actor {
    String actorName;
    int actorAge;
    Movie[] actorMovies;
    public boolean addActor(String name, int age){
        try{
            actorName=name;
            actorAge=age;
            return true;
        }catch (Exception e){
        System.out.println(e.getMessage());
        return false;
        }
    }
}
