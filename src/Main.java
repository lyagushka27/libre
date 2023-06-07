import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Создаём массив чителей
        ArrayList<Reader> readers = new ArrayList<>();
        readers.add(new Reader("Саша"));
        readers.add(new Reader("Маша"));

        // Создаём массив книг
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Лето в пионерсокм галстуке", "Пушкин А.С."));
        books.add(new Book("О чем молчит ласточка", "Лермонтов М.Ю"));
        books.add(new Book("Тетрадь смерти", "Хаяо Миадзаки"));
        books.add(new Book("Очень странные дела", "Хаяо Миадзаки"));

        // Создаём библеотеку, которая будет распоряжаться массивами читателей и книг
        Library library = new Library(readers, books);
        Menu menu = new Menu (library);

        // Запускаем меню для управления
        menu.start();

    }
}
