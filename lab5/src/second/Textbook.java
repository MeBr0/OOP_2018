package second;

public class Textbook {
    private String isbn;
    private String title;
    private String author;

    public Textbook() {

    }

    public Textbook(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    @Override
    public String toString() {
        return String.format("%s: ISBN - %s, title - %s, author - %s", getClass(), getIsbn(), getTitle(), getAuthor());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Textbook) {
            Textbook other = (Textbook) obj;

            if (!isbn.equals(other.isbn)) return false;

            else if (!title.equals(other.title)) return false;

            else if (!author.equals((other.author))) return false;

            else return true;
        }
        else return false;
    }
}
