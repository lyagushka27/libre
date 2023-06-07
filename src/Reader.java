/**
 * Читатель в библеотеке
 */
public class Reader {
    /**
     * Имя читателя
     */
    private String name;

    /**
     * @param name Имя читателя при создании
     */
    public Reader(String name){
        this.name = name;
    }

    /**
     * @return Имя читателя
     */
    public String getName() {
        return name;
    }

    /**
     * @param n Новое имя читателя
     */
    public void setName(String n) {
        this.name = n;
    }
}
