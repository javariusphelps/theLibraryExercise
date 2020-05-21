public class cardholder {

    private String name;
    private int age, yearjoined, bookscheckedout;
    private boolean reservedbooks;

    public cardholder(String name, int age, int yearjoined, int bookscheckedout, boolean reservedbooks) {
        this.name = name;
        this.age = age;
        this.yearjoined = yearjoined;
        this.bookscheckedout = bookscheckedout;
        this.reservedbooks = reservedbooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearjoined() {
        return yearjoined;
    }

    public void setYearjoined(int yearjoined) {
        this.yearjoined = yearjoined;
    }

    public int getBookscheckedout() {
        return bookscheckedout;
    }

    public void setBookscheckedout(int bookscheckedout) {
        this.bookscheckedout = bookscheckedout;
    }

    public boolean isReservedbooks() {
        return reservedbooks;
    }

    public void setReservedbooks(boolean reservedbooks) {
        this.reservedbooks = reservedbooks;
    }

}