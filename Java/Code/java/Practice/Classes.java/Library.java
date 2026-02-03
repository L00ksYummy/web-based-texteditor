public class Library{

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();

        b1.setBookInfo("Geralds Game", "Steven King", "9867052498012", "October 28,1998");
        b2.setBookInfo("Farenheight 451", "Ray Bradbury", "9783060311354", "October 19, 1951");


        b1.PrintInfo();
    }
}