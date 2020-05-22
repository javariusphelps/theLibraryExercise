public class library {

    public static void main(String[] args) {

        Book mybook = new Book(null, null, 0, null, 0, 0);

        mybook.display();

        periodicals myPeriodicals = new periodicals("fiction", "The Gazette", 2019, 0, 0);

        myPeriodicals.display();

    }

}
