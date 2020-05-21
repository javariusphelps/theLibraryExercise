public class general extends Book {

    private String novel, fiction, nonfiction;

    public general(String genre, String author, int copyright, String title, int numberOfPages, int chapters,
            String novel, String fiction, String nonfiction) {
        super(genre, author, copyright, title, numberOfPages, chapters);
        this.novel = novel;
        this.fiction = fiction;
        this.nonfiction = nonfiction;
    }

    public String getNovel() {
        return novel;
    }

    public void setNovel(String novel) {
        this.novel = novel;
    }

    public String getFiction() {
        return fiction;
    }

    public void setFiction(String fiction) {
        this.fiction = fiction;
    }

    public String getNonfiction() {
        return nonfiction;
    }

    public void setNonfiction(String nonfiction) {
        this.nonfiction = nonfiction;
    }

}