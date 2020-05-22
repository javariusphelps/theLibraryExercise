public class periodicals extends libraryItem implements Loanable {

    private int volumes, issues;

    public periodicals(String genre, String author, int copyright, int volumes, int issues) {
        super(genre, author, copyright);
        this.volumes = volumes;
        this.issues = issues;
    }

    public int getVolumes() {
        return volumes;
    }

    public void setVolumes(int volumes) {
        this.volumes = volumes;
    }

    public int getIssues() {
        return issues;
    }

    public int setIssues(int issues) {
        return this.issues = issues;
    }

    @Override
    public void display() {
        System.out.println("Periodicals cannot be rented outside of library");

    }
}
