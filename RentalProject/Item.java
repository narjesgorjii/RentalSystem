import java.util.Date;

abstract class Item {
    private int id;
    private String title;
    private String genre;
    private Date releaseDate;
    private boolean isAvailable;

    public Item(String title,String genre,int id) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = new Date();
        this.id = id;

        isAvailable = true;
    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public Date getReleaseDate() {
        return releaseDate;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
