import java.util.ArrayList;

public class BookBuilder {
    private String title;
    private String isbn;
    private String price;
    private Author author;
    private ArrayList<BookType> bookTypes = new ArrayList<>();
    public BookBuilder(String title) {
        this.title = title;
    }

    public BookBuilder setTitle(String title) { this.title = title; return this; }
    public BookBuilder setISBN(String isbn) { this.isbn = isbn; return this; }
    public BookBuilder setPrice(String price) { this.price = price; return this; }
    public BookBuilder setAuthor(Author author) { this.author = author; return this; }
    public BookBuilder addbookType(BookType bookType) { bookTypes.add(bookType); return this;}

    public Book buildBook() {
        var book = new Book(title, isbn, price, author);
        for (var bookType : bookTypes)
            book.addBookType(bookType);

        return book;
    }

}
