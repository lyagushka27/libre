/**
 * Класс книги, имеющий только геттеры на свои переменные
 */
public class Book {
    private final String name;
    private final String author;
    
    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }
}
