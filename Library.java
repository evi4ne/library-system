import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void printBooksByAuthor(String author) {
        System.out.println("Книги автора " + author + " в библиотеке " + name + ":");
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                book.printBookInfo();
            }
        }
    }

    public void printAllBooks() {
        System.out.println("Все книги в библиотеке " + name + ":");
        for (Book book : books) {
            book.printBookInfo();
        }
    }
}