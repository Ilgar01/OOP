package movies;

import java.util.ArrayList;

public class Director {
    String directorName;
    int directorAge;
    ArrayList<Movie> directorMovies;
    public boolean addDirector(String name, int age){
        try{
            directorName=name;
            directorAge=age;
            return true;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    public void addMovie(Movie movie){
        directorMovies.add(movie);
    }
}
