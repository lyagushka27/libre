public class Main {

    public static void main(String[] args) {
        Library lib = new Library();

        Book[] books1 = {
                new Book("Энциклопедия", "Пушкин"),
                new Book("Приключения", "Антон"),
                new Book("Словарь", "Тоже Антон")
        };
        Book[] books2 = {
                new Book("Книги", "Пушкин"),
                new Book("На", "Антон"),
                new Book("Выдачу", "Тоже Антон")
        };


        lib.takeBook(3);
        lib.takeBook(books1);

        lib.returnBook(1);
        lib.returnBook(books2);

        Book[] books3 = {};
        lib.takeBook(books3);
    }
}