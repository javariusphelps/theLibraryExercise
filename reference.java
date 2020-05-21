public class reference extends Book {

    private String type;

    public reference(String genre, String author, int copyright, String title, int numberOfPages, int chapters,
            String type) {
        super(genre, author, copyright, title, numberOfPages, chapters);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}