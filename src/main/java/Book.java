public class Book {
//basic and simple
    
    private String author;
    private String title;
    private String ISBN;
// book wit a title author and International Standard Book Number or ISBN
    public Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    //basic setters and getters

    public String getISBN() {
        return ISBN;
    }
    // title
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


    
}