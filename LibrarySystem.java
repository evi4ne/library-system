public class LibrarySystem {
    public static void main(String[] args) {
        Library library1 = new Library("Центральная библиотека");
        Library library2 = new Library("Городская библиотека");

        library1.addBook(new Book("Мастер и Маргарита", "Михаил Булгаков", 1967));
        library1.addBook(new Book("Война и мир", "Лев Толстой", 1869));
        library2.addBook(new Book("1984", "Джордж Оруэлл", 1949));
        library2.addBook(new Book("Мастер и Маргарита", "Михаил Булгаков", 1967));

        library1.printBooksByAuthor("Михаил Булгаков");
        library2.printBooksByAuthor("Михаил Булгаков");

        library1.printAllBooks();
        library2.printAllBooks();
    }
}