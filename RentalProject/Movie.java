class Movie extends Item {

    private String director;
    private String cast;
    
    public Movie(String title,String genre,int id,String director,String cast) {
        
        super(title,genre,id);

        this.director = director;
        this.cast = cast;
    }

    public String getDirector() {
        return director;
    }
    public String getCast() {
        return cast;
    }
    
}
