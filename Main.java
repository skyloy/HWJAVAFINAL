public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Anya","85435");
        phoneBook.add("Anya", "8328448");
        phoneBook.add("Andrey","432434343");
        phoneBook.add("Sofia","7345653");
        phoneBook.add("Sofia","7387663");
        phoneBook.add("Sofia","7673346");


        System.out.println(phoneBook.toString());
    }
}
