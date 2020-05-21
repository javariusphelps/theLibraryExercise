public class newspaper extends periodicals {

    private boolean digital;
    private boolean sportspage;

    public newspaper(String genre, String author, int copyright, int volumes, int issues, boolean digital,
            boolean sportspage) {
        super(genre, author, copyright, volumes, issues);
        this.digital = digital;
        this.sportspage = sportspage;
    }

    public boolean isDigital() {
        return digital;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    public boolean isSportspage() {
        return sportspage;
    }

    public void setSportspage(boolean sportspage) {
        this.sportspage = sportspage;
    }

    @Override
    public int setIssues(int issue) {
        return issue = 365;
    }
}