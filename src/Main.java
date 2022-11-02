public class Main {
    public static void main(String[] args) {
        Phonebook phonebook1 = new Phonebook();
        phonebook1.addContact("Марина", "+7 922 468-45-67");
        phonebook1.addContact("Олег", "84735298088");
        phonebook1.addContact("Витя", "+7 922-573-4567");
        phonebook1.addContact("Маша", "+49 1574 4624638");
        phonebook1.addContact("Таня", "8 (481) 261-009-58");
        phonebook1.addContact("Зина", "+75256136997");

        Phonebook.getPhonebook();

    }
}