public class Book{

    String name;
    String author;
    String isbn;
    String publishDate;

    public Book(){
        this.name = "";
        this.author = "";
        this.isbn = "";
        this.publishDate = "";
    }

    public void setBookInfo(String name, String author, String isbn, String publishDate){
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.publishDate = publishDate;
    }

    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public String getISBN(){
        return isbn;
    }
    public String getPublishDate(){
        return publishDate;
    }
    public void PrintInfo(){
        System.out.println("Name: " + name + "\nAuthor: " + author + "\nISBN: " + isbn + "\nPublished on: " + publishDate);
    }
}