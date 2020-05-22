import java.util.List;

public class PublishingCompany {

    public List<Author> authors;
    public String name;

    public PublishingCompany(List<Author> authors) {

        this.authors = authors;
        this.name = name;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }
}
