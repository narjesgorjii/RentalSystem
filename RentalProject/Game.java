class Game extends Item {
    
    private String platform;
    private String publisher;

    public Game(String title,String genre,int id,String platform,String publisher) {
        
        super(title, genre, id);

        this.platform = platform;
        this.publisher = publisher;
    }

    public String getPlatform() {
        return platform;
    }
    public String getPublisher() {
        return publisher;
    }

}
