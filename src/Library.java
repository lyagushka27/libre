import java.util.ArrayList;
/**
 * Библеотека
 * <p>
 * <b>readerList</b>  Список читателей, которыми управляет библеотека
 * <p>
 * <b>bookList</b>    Список книг, которыми управляет библеотека
 **/
public class Library {

    private final ArrayList<Reader> readerList;
    private final ArrayList<Book> bookList;

    /**
     * Конструктор библеотеки
     *
     * @param r Список чителей
     * @param b Список книг
     *
     * В дальнейшем, библеотека будет работать с этими 2 массивами
     */
    public Library(ArrayList<Reader> r, ArrayList<Book> b) {
        this.readerList=r;
        this.bookList=b;
    }

    /**
     * Возвращает читателя с соотвесвующим номером
     * @param n Номер читателя
     * @return Читатель
     */
    public Reader getReader(int n){
        return readerList.get(n);
    }

    /**
     * Регистриует нового читателя в библеотеке
     * @param r Новый читатель
     */
    public void addReader(Reader r){
        this.readerList.add(r);
    }

    /**
     * Удаляет читателя из библеотеки
     * @param n Номер читателя в списке читателей библеотеки
     */
    public void removeReader(int n) {
        Reader r = this.getReader(n);

        for (int i = 0; i < this.bookList.toArray().length; i++) {
            if (this.bookList.get(i).getOwner() == r) {
                System.out.println("У этого читателя взята книга, поэтому его нельзя удалить");
                return;
            }
        }

        this.readerList.remove(n);
    }

    /**
     * @return Строка со списком всех читателей, зарегистрированных в библеотеке и их ключом, формата: "0. Имя"
     */
    public String showReaderList(){
        String r = "";
        for (int i=0; i < this.readerList.toArray().length; i++){
            r+=String.format("%d. %s\n", i, this.readerList.get(i).getName());
        }
        return r;
    }

    /**
     * Отдаёт книгу читателю
     *
     * @param n Номер книги
     * @param r Читатель
     */
    public void takeBook(int n, Reader r){
        Book b = this.bookList.get(n);
        if (b.getOwner() != null) {
            System.out.println("Книга уже взята");
            return;
        }
        b.setOwner(r);
    }

    /**
     * Читатель возвращает книгу в библеотеку
     * @param n номер книги
     * @param r читатель
     */
    public void returnBook(int n, Reader r){
        Book b = this.bookList.get(n);
        if (b.getOwner()==r){
            b.setOwner(null);
            return;
        }
        System.out.println("Вы не владелец этой книги");
    }

    /**
     * @return Строка со списком всех книг, зарегистрированных в библеотеке и их ключом, формата: "0. Название. Автор"
     */
    public String showBookList(){
        String b = "";
        for (int i=0; i < this.bookList.toArray().length; i++){
            if(this.bookList.get(i).getOwner() == null){
                b += String.format("%d. %s. %s\n", i, this.bookList.get(i).getName(),this.bookList.get(i).getAuthor());
            } else {
                b += String.format("%d. [В данное время книга у %s] %s. %s\n", i, this.bookList.get(i).getOwner().getName(), this.bookList.get(i).getName(),this.bookList.get(i).getAuthor());
            }
        }
        return b;
    }

}
