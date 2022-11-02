import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private static final HashMap<String, String> phonebook = new HashMap<>();

    public void addContact(String name, String phone) {
        if (phonebook.containsKey(name)) {
            throw new IllegalArgumentException("Данный контакт уже существует");
        } else if (phonebook.containsValue(phone)) {
            throw new IllegalArgumentException("Данный номер уже существует");
        } else {
            phonebook.putIfAbsent(name, phone);
        }
    }

    public static void getPhonebook() {
        for (Map.Entry<String, String> entry : phonebook.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
