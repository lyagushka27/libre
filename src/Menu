import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Класс меню
 * Здесь происходит управление библеотекой
 */
public class Menu {
    private final Library library;
    private Reader reader;
    private final Scanner scanner = new Scanner(System.in);

    public Menu(Library library) {
        this.library=library;
    }

    /**
     * Главное меню
     */
    public void mainMenu() {
        System.out.print("Главное меню \n1. Выбрать из имеющихся пользователей \n2. Добавить нового читателя \n3. Удалить читателя\n> ");
        try{
            int input = this.scanner.nextInt();
            switch (input) {
                case 1:
                    this.selectReader();
                case 2:
                    this.createReader();
                case 3:
                    this.deleteReader();
                default:
                    this.errorInputMessage();
                    this.mainMenu();
            }
        } catch (InputMismatchException e) {
            this.scanner.nextLine();
            this.mainMenu();
        }
    }

    /**
     * Устанавливает читателя от имени которого будет управление
     * @param n номер читателя
     */
    public void setReader(int n){
        reader= library.getReader(n);
    }

    /**
     * Выводит список зарегистрированных читателей в библеотеке
     */
    public void showReaders(){
        System.out.printf("Список имеющихся читателей: \n%s\n> ", library.showReaderList());
    }

    /**
     * Регистрирует нового читателя в библеотеке
     */
    public void createReader() {
        this.scanner.nextLine();
        System.out.print("Введите имя нового читателя (0 для отмены)\n> ");
        String name = this.scanner.nextLine();
        Reader r = new Reader(name);
        this.library.addReader(r);
        this.selectReader();
    }

    /**
     * Удаляет читателя из библеотеки
     */
    public void deleteReader() {
        this.showReaders();
        try {
            int n = this.scanner.nextInt();
            this.library.removeReader(n);
            this.mainMenu();
        } catch (InputMismatchException e) {
            this.scanner.nextLine();
            this.errorInputMessage();
        }
    }

    /**
     * Выбор читателя, для дальнейших действий в библеотеке
     */
    public void selectReader() {
        this.showReaders();
        try {
            int n = this.scanner.nextInt();
            this.setReader(n);
            this.selectBookAction();

        } catch (InputMismatchException e) {
            this.scanner.nextLine();
            this.selectReader();
        }
    }

    /**
     * Выводит список всех книг в библеотеке
     */
    public void showBooks(){
        System.out.printf("[%s] Список книг: \n%s\n> ", reader.getName(), library.showBookList());
    }

    /**
     * Выбор действия с книгой (взять / вернуть)
     */
    public void selectBookAction(){
        System.out.print("1. Взять книгу\n2. Вернуть книгу\n> ");

        try {
            int input = this.scanner.nextInt();
            switch (input) {
                case 1:
                    this.takeBook();
                case 2:
                    this.returnBook();
                default:
                    this.errorInputMessage();
                    this.selectBookAction();
            }
        } catch (InputMismatchException e) {
            this.scanner.nextLine();
            this.selectBookAction();
        }

    }

    /**
     * Выбор книги читателем, который сейчас выбран
     */
    public void takeBook(){
        this.showBooks();
        try {
            int n = this.scanner.nextInt();
            this.library.takeBook(n, this.reader);
            this.mainMenu();
        } catch (InputMismatchException e) {
            this.scanner.nextLine();
            this.errorInputMessage();
            this.takeBook();
        }
    }

    /**
     * Возравщает книгу в библеотеку
     */
    public void returnBook(){
        this.showBooks();
        try {
            int n = this.scanner.nextInt();
            this.library.returnBook(n, this.reader);
            this.mainMenu();
        } catch (InputMismatchException e) {
            this.scanner.nextLine();
            this.errorInputMessage();
            this.returnBook();
        }
    }

    /**
     * Сообщение о некоректном вводе
     */
    public void errorInputMessage() {
        System.out.println("Неправильный ввод");
    }

    /**
     * Точка входа в меню
     */
    public void start() {
        this.mainMenu();
    }
}
