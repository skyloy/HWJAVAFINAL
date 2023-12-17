import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

class PhoneBook extends PhoneSort {
    private HashMap<String, TreeSet<String>> phoneBook = new HashMap<>();


    /**
     * Метод add добавляет запись в телефонную книгу.
     * Если будет передано повторяющееся имя, то метод посчитает его одним человеком
     * и добавит телефон к ранее добавленному человеку с этим именем(условие заданчи).
     * Если человека с этим именем в книге не будет,
     * то метод сделает новую запись.
     */
    public void add(String name, String phone) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new TreeSet<>());
        }
        phoneBook.get(name).add(phone);
    }

    /**
     * Метод find возвращает номер(а) телефонов по имени человека.
     */
    public String find(String name) {
        return phoneBook.get(name) + " ";
    }

    @Override
    public String toString() {

        return sortPhones(phoneBook).toString();
    }
}

