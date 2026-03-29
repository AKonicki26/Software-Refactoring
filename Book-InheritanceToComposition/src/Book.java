import java.util.ArrayList;

public class Book {
    private String title;
    private String isbn;
    private String price;
    private Author author;
    private ArrayList<BookType> bookTypes = new ArrayList<>();


    public Book(String title, String isbn, String price, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPrice() {
        return price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor (Author author) {
        this.author = author;
    }

    public void addBookType(BookType bookType) { this.bookTypes.add(bookType); }


    public String toXml() {

        String authorXml = author.xmlPayload();
        StringBuilder bookTypeXML = new StringBuilder();

        for (var bookType : bookTypes)
            bookTypeXML.append(bookType.xmlPayload() + "\r\n");

        String bookXml = XML.tag("book",
                XML.tag("title", title) + "\r\n" +
                        XML.tag("isbn", isbn) + "\r\n" +
                        XML.tag("price", price) + "\r\n" +
                        authorXml + "\r\n" +
                        bookTypeXML);
        return bookXml;
    }
}
