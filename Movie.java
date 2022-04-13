public class Movie {
    private String title;
    private String studio;
    private String rating;

    //Part2_PartA
    public Movie(String title, String studio, String rating)
    {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    //Part2_PartB
    public Movie(String title, String studio)
    {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    //Part2_PartC
    public Movie[] getPG(Movie[] movies )
    {
        int moviePos = 0;

        Movie[] returnedMovies = {};
        for( int i = 0; i < movies.length; i++)
        {
            if( movies[i].rating.equals("PG") )
            {
                returnedMovies[moviePos] = movies[i];
            }
            moviePos++;
        }

        return returnedMovies;
    }
}
