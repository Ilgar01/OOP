package movies;

public class Main {
    public static void main(String[] args) {
      Director christopher =new Director();
      christopher.addDirector("Christopher Nolan",50);
      Actor matthew = new Actor();
      matthew.addActor("Matthew", 45);
      Actor jessica = new Actor();
      jessica.addActor("Jessica",40);
      Movie interstellar = new Movie();
      interstellar.movieDirector=christopher;
      christopher.addMovie(interstellar);
      interstellar.movieActors.add(matthew);
      interstellar.movieActors.add(jessica);
      interstellar.showAllMovies();
    }
}
