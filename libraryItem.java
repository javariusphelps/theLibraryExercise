public class libraryItem {

    private String genre, author;
    private int copyright;

    libraryItem(String genre, String author, int copyright) {
        this.genre = genre;
        this.author = author;
        this.copyright = copyright;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCopyright() {
        return copyright;
    }

    public void setCopyright(int copyright) {
        this.copyright = copyright;
    }

}