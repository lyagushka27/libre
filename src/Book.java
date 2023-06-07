/**
 * Книга в библеотеке
 */
public class Book {
    /**
     * @see Book#name   Название книги
     * @see Book#author Автор книги
     * @see Book#owner  Пользователь у которого в данных момент находится эта книга, null если книг в библеотеке
     */
    private final String name;
    private final String author;
    private Reader owner;

    /**
     * Конструктор новой книги
     * @param name      Имя книги
     * @param author    Автор книги
     */
    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    /**
     * Геттер
     * @return Автор
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Геттер
     * @return Название книги
     */
    public String getName() {
        return name;
    }

    /**
     * Геттер
     * @return Владелец книги (null если книга в библеотеке)
     */
    public Reader getOwner() {
        return owner;
    }

    /**
     * Сеттер
     * @param r Читатель, которому отдана книга
     */
    public void setOwner(Reader r){
        this.owner = r;
    }
}
