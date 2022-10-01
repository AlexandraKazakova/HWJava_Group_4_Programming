package HW5;

import java.util.HashMap;

/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов. */
public class Task2 {
	public static void main(String[] args) {
		HashMap<String, String> telephoneBook = new HashMap<>();
		telephoneBook.put("89133502213", "Ivanov Ivan");
		telephoneBook.put("89393502200", "Ivanov Ivan");
		telephoneBook.put("89688502258", "Smirnov Oleg");
		telephoneBook.put("89653777292", "Ivanova Irina");
		telephoneBook.put("89283502214", "Sidorov Fedor");
		System.out.println(telephoneBook);
	}
}
