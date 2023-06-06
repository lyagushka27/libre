/**
 * Класс библеотеки, отвественный за выдачу и приём книг
 **/
public class Library {

    public Library() {
    }

    public void takeBook(int n) {
        System.out.printf("Я взял %d книги\n", n);
    }

    public void returnBook(int n) {
        System.out.printf("Я вернул %d книги\n", n);
    }

    public void takeBook(Book[] books) {
        System.out.printf("Я взял книги: %s.\n", bookList(books));
    }

    public void returnBook(Book[] books) {
        System.out.printf("Я вернул книги: %s.\n", bookList(books));
    }

    private String bookList(Book[] books) {
        /* Функиця для сборки строки из списка объектов книг */
        StringBuilder msg = new StringBuilder();
        for (int i = 0; i < books.length; i++) {
            msg.append(books[i].getName());
            if (i < books.length - 1) {
                msg.append(", ");
            }
        }
        return msg.toString();
    }

}
