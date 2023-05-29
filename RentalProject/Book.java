class Book extends Item {

    private String author;
    private String publisher;
    
    public Book(String title,String genre,int id,String author,String publisher) {
        
        super(title, genre, id);

        this.author = author;
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }
    public String getPublisher() {
        return publisher;
    }

}
