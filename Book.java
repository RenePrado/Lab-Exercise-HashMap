import java.util.HashMap;

public class Book {
    private String isbn;
    private String title;
    HashMap<String, Author> authorHashMap;
    public HashMap<String, Author> getAuthorHashMap() {
        return authorHashMap;
    }

    public void setAuthorHashMap(HashMap<String, Author> authorHashMap) {
        this.authorHashMap = authorHashMap;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
