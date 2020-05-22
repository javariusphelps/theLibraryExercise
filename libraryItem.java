public class libraryItem implements Loanable {

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

    @Override
    public void lateCharge(Charges charge) {
        switch (charge) {
            case DAILY:
                System.out.println("Charged: $1");
                break;
            case WEEKLY:
                System.out.println("Charged: $7");
                break;
            case BIWEEKLY:
                System.out.println("Charged: $14");
                break;
            case MONTHLY:
                System.out.println("Charged: $30");
                break;
            default:
                System.out.println("No Late Charges.");
                break;
        }
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub

    }

}