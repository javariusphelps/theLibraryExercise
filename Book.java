public class Book extends libraryItem implements Readable {

    private String title;
    private int numberOfPages, chapters;

    public Book(String genre, String author, int copyright, String title, int numberOfPages, int chapters) {
        super(genre, author, copyright);
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.chapters = chapters;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    @Override
    public void display() {
        System.out.println("JP 10 pages left");
    }

}