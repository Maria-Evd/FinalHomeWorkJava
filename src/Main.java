public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        PhoneBook.add("89765436758", "Иван");
        PhoneBook.add("86547806523", "Наталья");
        PhoneBook.add("86549747098", "Сергей");
        PhoneBook.add("86789756456", "Иван");
        PhoneBook.add("85438648905", "Михаил");
        PhoneBook.add("84326745623", "Анатолий");
        PhoneBook.add("89436549056", "Наталья");
        System.out.println(PhoneBook.getPhoneNum("89765436758"));
        System.out.println(PhoneBook.getByName("Анатолий"));
        System.out.println(PhoneBook.getAll());
    }
}
