package movies;

import java.util.*;

public class Movie {
 String movieName;
 int movieYear;
 double movieImdb;
 ArrayList<Actor> movieActors;
 Director movieDirector;
 static int movieId;
 static ArrayList<Movie> movies;
 public boolean addMovie(String name, int year, double imdb, Director director){
  try{
   movieName=name;
   movieYear=year;
   movieImdb= imdb;
   movieDirector=director;
   movieId++;
   movies.add(this);
   return true;

  }
  catch(Exception e){
   System.out.println(e.getMessage());
   return false;
  }

 }
  public boolean deleteMovie(int id){
   try{
    movies.set(id,null);
    movies.remove(id);
    movieId--;
    return true;
   }catch (Exception e){
    System.out.println(e.getMessage());
    return false;
   }
  }
  public void showAllMovies(){
  Iterator<Movie> movie = movies.iterator();
  int j=0;
   for(int i=0; i<=movieId;i++){
    String[] movieActorsNames =new String[movieActors.size()];
    for(Actor actor:movie.next().movieActors){
    movieActorsNames[j]=actor.actorName;
    j++;
    }
    System.out.println("id: "+i+" |Movie name: "+movie.next().movieName+" |Movie year: "+movie.next().movieYear+
            " |Imdb: "+movie.next().movieImdb+" |Director: "+
            movie.next().movieDirector+" |Actors: "+ Arrays.toString(movieActorsNames));
   }
  }
}
