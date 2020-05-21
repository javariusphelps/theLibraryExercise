public class magazine extends periodicals {

    private boolean coloredpages;

    public magazine(String genre, String author, int copyright, int volumes, int issues, boolean coloredpages) {
        super(genre, author, copyright, volumes, issues);
        this.coloredpages = coloredpages;
    }

    public boolean isColoredpages() {
        return coloredpages;
    }

    public void setColoredpages(boolean coloredpages) {
        this.coloredpages = coloredpages;
    }

}